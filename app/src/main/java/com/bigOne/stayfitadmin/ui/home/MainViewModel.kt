package com.bigOne.stayfitadmin.ui.home


import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.bigOne.stayfitadmin.datas.model.UserData
import com.bigOne.stayfitadmin.datas.repository.FirestoreRepository

class  MainViewModel(application: Application) : AndroidViewModel(application) {
    private val firebaseRepository: FirestoreRepository = FirestoreRepository(getApplication())
    //private val mealRepo : MeallogRepository = MeallogRepository(getApplication())
    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading
    private val _isSavedUser = MutableLiveData<Boolean>()
    val isSavedUser: LiveData<Boolean> = _isSavedUser

    var savedUserData : MutableLiveData<UserData?> = MutableLiveData()

    private val _isUpdateUser = MutableLiveData<Boolean>(false)
    val isUpdateUser : LiveData<Boolean> = _isUpdateUser

    private val _users = MutableLiveData<List<UserData>>()
    val users: LiveData<List<UserData>> = _users


    private val _isApproveTrainer = MutableLiveData<Boolean>(false)
    val isApproveTrainer : LiveData<Boolean> = _isApproveTrainer

    fun getUsersList(): LiveData<List<UserData>> {
        firebaseRepository.getUsersData().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val users = mutableListOf<UserData>()

                val documents = task.result?.documents

                if (documents != null) {
                    for (document in documents) {
                        val data = document.data
                        val user = data?.let { mapToUserData(it) }
                        Log.e("queryusers", data.toString())
                        if (user != null) {
                            users.add(user)
                        }
                    }
                }

                _users.value = users
                Log.e("queryusersArray", users.toString())
            }
        }
        return users
    }







    private fun mapToUserData(data: Map<String, Any>): UserData {
        return UserData(
            sex = data["sex"] as?String?: "",
            dob = data["dob"] as? String?:"",
            weight = data["weight"] as? String?:"",
            height = data["height"] as? String?:"",
           id = data["id"] as? String?:"",
            img = data["img"] as? String?:"",
            email = data["email"] as? String?:"",
            name = data["name"] as? String?:"",
            isTrainer = data["trainer"] as Boolean,
            approved = data["approved"] as Boolean,

        )
    }



    companion object {

    }
    fun approvedTrainer(id: String): LiveData<Boolean> {
        firebaseRepository.approvedTrainer(id).addOnSuccessListener {
            _isApproveTrainer.value = true
        }.addOnFailureListener {
            _isApproveTrainer.value=false
        }
        return  isApproveTrainer
    }
}





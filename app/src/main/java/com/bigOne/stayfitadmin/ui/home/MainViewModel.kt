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









    private fun mapToUserData(data: Map<String, Any>): UserData {
        return UserData(
            sex = data["sex"] as String,
            dob = data["dob"] as String,
            weight = data["weight"] as String,
            height = data["height"] as String
        )
    }

    fun getUsersList() {
        firebaseRepository.getUsersData().addOnSuccessListener {
            Log.e("query",it.size().toString())
        }
    }


    companion object {

    }


}


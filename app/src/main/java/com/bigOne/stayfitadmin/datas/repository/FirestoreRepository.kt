package com.bigOne.stayfitadmin.datas.repository

import android.app.Application
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bigOne.stayfitadmin.datas.repository.FirestoreRepository.Companion.USER_FIREBASE_DATA_KEY
import com.bigOne.stayfitadmin.ui.home.MainViewModel
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot


class FirestoreRepository(c :Application) {

    private fun activityViewModels() {

    }

    var db = FirebaseFirestore.getInstance()


    companion object {
        const val USER_FIREBASE_DATA_KEY = "users"
    }


    fun getUsersData(): Task<QuerySnapshot> {
        val collectionReference = db.collection(USER_FIREBASE_DATA_KEY).get()
        return collectionReference
    }
}





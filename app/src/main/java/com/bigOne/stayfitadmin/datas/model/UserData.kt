package com.bigOne.stayfitadmin.datas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserData(
    val sex: String?,
    val dob: String?,
    var weight: String?,
    val height: String?,
    val email: String?,
    val id:String?,
    val name:String?,
    val img: String?,
    var isTrainer: Boolean =false,
    var approved : Boolean =false,
    val qualification : String?,
    val experience: String?
) : Parcelable
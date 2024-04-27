package com.bigOne.stayfitadmin.datas.model

data class UserData(
    val sex: String,
    val dob: String,
    var weight: String,
    val height: String,
    val email: String,
    val id:String,
    val name:String,
    val img: String,
    var isTrainer: Boolean =false,
    var approved : Boolean =false
)
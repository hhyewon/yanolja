package com.example.yanolja.src.user.models



import com.google.gson.annotations.SerializedName

data class PostSignUpRequest (

    val userName:String,
    val userPhone:String,
    val userEmail:String,
    val userNickname: String,
    val userPwd: String,
    val userBirth: String,

    )
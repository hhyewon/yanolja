package com.example.yanolja.src.user

import com.example.yanolja.src.user.models.SignUpResponse

interface SignUpActivityView {
    fun onPostSignUpSuccess(response: SignUpResponse)
    fun onPostSignUpFailure(message: String)

}
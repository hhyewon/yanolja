package com.example.yanolja.src.user

import android.util.Log
import com.example.yanolja.config.ApplicationClass
import com.example.yanolja.config.ApplicationClass.Companion.sRetrofit
import com.example.yanolja.src.user.models.PostSignUpRequest
import com.example.yanolja.src.user.models.SignUpResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpService(val view: SignUpActivityView) {


    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest) {
        System.out.println("1")

        val signUpRetrofitInterface =
           sRetrofit.create(UsersRetrofitInterface::class.java)

        signUpRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object :
            Callback<SignUpResponse> {
            override fun onResponse(
                call: Call<SignUpResponse>,
                response: Response<SignUpResponse>

            ) {
                System.out.println("2")

                view.onPostSignUpSuccess(response.body() as SignUpResponse)
            }

            override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
                view.onPostSignUpFailure(t.message ?:"통신오류")
            }
        })
    }




}
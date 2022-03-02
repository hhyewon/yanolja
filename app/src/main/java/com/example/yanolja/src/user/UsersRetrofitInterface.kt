package com.example.yanolja.src.user

import com.example.yanolja.src.user.models.PostSignUpRequest
import com.example.yanolja.src.user.models.SignUpResponse
import retrofit2.Call
import retrofit2.http.*

interface UsersRetrofitInterface {

//    @POST("/app/users")
//    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>

    @POST("/app/users/sign-in")
    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>


//    @GET("/app/users/{userInfoIdx}")
//    fun getMyPage(
//        @Header("x-access-token") X_ACCESS_TOKEN: String,
//        @Path("userInfoIdx") userInfoIdx: Int,
//    ): Call<MyPageResponse>

//
//    @PATCH("/app/users/{userInfoIdx}")
//    fun patchProfile(@Body params: RequestProfile) : Call<ResponseProfile>
//    fun jwtIdx(@Header("x-access-token") X_ACCESS_TOKEN: String,
//               @Path("userInfoIdx") userInfoIdx: Int): Call<ResponseProfile>


//    @PATCH("/app/users/{userInfoIdx}")
//    fun patchProfile(
//        @Body params: RequestProfile,
//        @Header("x-access-token") X_ACCESS_TOKEN: String,
//        @Path("userInfoIdx") userInfoIdx: Int,
//    ): Call<ResponseProfile>


}
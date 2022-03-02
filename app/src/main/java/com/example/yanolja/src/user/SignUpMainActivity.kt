package com.example.yanolja.src.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yanolja.src.user.models.PostSignUpRequest
import com.example.yanolja.src.user.models.SignUpResponse
import com.example.yanolja.databinding.ActivitySignupBinding
import com.example.yanolja.src.hotel.MainActivity


class SignUpMainActivity : AppCompatActivity(), SignUpActivityView {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.signUp.setOnClickListener {
            val userName = binding.username.text.toString()
            val userPhone = binding.phoneNumber.text.toString()
            val userEmail = binding.email.text.toString()
            val userNickname = binding.nickname.text.toString()
            val userPwd = binding.password.text.toString()
            val userBirth = binding.userBirth.text.toString()


            val postRequest = PostSignUpRequest(
                userName= userName!!,
                userPhone = userPhone!!,
                userEmail = userEmail!!,
                userNickname = userNickname!!,
                userPwd = userPwd!!,
                userBirth = userBirth!!
            )
            SignUpService(this).tryPostSignUp(postRequest)
        }





    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        }
    }

    override fun onPostSignUpSuccess(response: SignUpResponse) {
        response.message?.let {  }
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onPostSignUpFailure(message: String) {
        System.out.println("회원가입 실패")

    }
}
package com.example.chattychat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View){

    }
    fun loginSignUpBtnClicked(view:View){
        val intent = Intent(this,SignupActivity::class.java)
        startActivity(intent)
    }
}

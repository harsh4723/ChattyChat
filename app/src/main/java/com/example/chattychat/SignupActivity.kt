package com.example.chattychat

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.*

class SignupActivity : AppCompatActivity() {
    var userAvatar = "profileDefault"
    var userColor = "[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun signUpAvatarImgOnclick(view: View) {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)
        if (color == 0) {
            userAvatar = "light$avatar"
        } else {
            userAvatar = "dark$avatar"
        }
        val resourceId = resources.getIdentifier(userAvatar,"drawable",packageName);
        signUpAvatarImgView.setImageResource(resourceId)
    }

    fun signUpAvatarColorBtnClicked(view: View) {
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)
        signUpAvatarImgView.setBackgroundColor(Color.rgb(r,g,b))
        val saveR = r.toDouble()/255
        val saveG = g.toDouble()/255
        val saveB = b.toDouble()/255

        userColor = "[$saveR,$saveG,$saveB,1]"
    }

    fun signUpCreateUserBtnClicked(view: View) {
    }
}

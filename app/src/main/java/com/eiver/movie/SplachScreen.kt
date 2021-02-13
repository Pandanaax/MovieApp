package com.eiver.movie

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

/*
* Create by Randa {DATE}
*/class SplachScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.splash_screen)
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@SplachScreen, MainActivity::class.java))
            //finish this activity
            finish()
        },4000)

    }
}
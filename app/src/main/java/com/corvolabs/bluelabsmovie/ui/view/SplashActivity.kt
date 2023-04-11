package com.corvolabs.bluelabsmovie.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.corvolabs.bluelabsmovie.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_background)

        val backgroundImg: ImageView = findViewById(R.id.iv_logo)
        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        backgroundImg.startAnimation(sideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        irNuevaActivity()
    }

    private fun irNuevaActivity(){
        val handler=Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 2500)
    }
}
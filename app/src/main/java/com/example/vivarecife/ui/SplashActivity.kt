package com.example.vivarecife.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.vivarecife.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handle = Handler()
        handle.postDelayed({
            val intent =  Intent(this, ParkListActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}

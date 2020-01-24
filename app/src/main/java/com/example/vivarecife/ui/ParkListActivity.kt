package com.example.vivarecife.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vivarecife.R

class ParkListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_list)

        supportActionBar?.title = getString(R.string.park_list)
    }
}

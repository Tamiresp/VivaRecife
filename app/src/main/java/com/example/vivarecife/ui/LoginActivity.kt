package com.example.vivarecife.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.vivarecife.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.title = getString(R.string.login)

        val login = edit_login.text.toString()
        val password = edit_password.text.toString()

        btn_login.setOnClickListener {
            if (login.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, EventListActivity::class.java)
                startActivity(intent)
            } else {
                Snackbar.make(findViewById(R.id.login_layout), getText(R.string.text_error), Snackbar.LENGTH_LONG).show()
            }
        }

        btn_register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return true
    }

    fun getUser(){

    }
}

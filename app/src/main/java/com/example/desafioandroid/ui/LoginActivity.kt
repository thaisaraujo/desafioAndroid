package com.example.desafioandroid.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Click btn login
        btnLogin.setOnClickListener(callActivity(MainActivity::class.java))

        //Click btn register
        tvRegister.setOnClickListener(callActivity(RegisterActivity::class.java))
    }

    private fun callActivity(activity: Class<out Activity>): View.OnClickListener? = View.OnClickListener {
        startActivity(Intent(this, activity))
    }


}
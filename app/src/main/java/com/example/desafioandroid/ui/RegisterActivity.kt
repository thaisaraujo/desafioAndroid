package com.example.desafioandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.register_top.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Click back
        setSupportActionBar(registerTop)
        registerTop.setNavigationOnClickListener(){
            finish()
        }
    
        //Click btn register
        btnRegister.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}
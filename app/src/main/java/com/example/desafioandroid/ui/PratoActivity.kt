package com.example.desafioandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.activity_prato.*
import kotlinx.android.synthetic.main.cardapio_top.*
import kotlinx.android.synthetic.main.prato_top.*

class PratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)

        //TOOLBAR
        val nomePrato = intent.getSerializableExtra("nome") as String
        val descrPrato = intent.getSerializableExtra("descrição") as String
        val imgPrato = intent.getSerializableExtra("imagem") as Int
        pratoImgTop.setImageResource(imgPrato)
        pratoNomeTop.text = nomePrato
        pratoDescricao.text = descrPrato

        //Click back
        pratoVoltaTop.setOnClickListener {
            finish()
        }

    }
}
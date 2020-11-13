package com.example.desafioandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.desafioandroid.R
import com.example.desafioandroid.domain.Prato
import com.example.desafioandroid.domain.PratoAdapter
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.cardapio_top.*

class CardapioActivity : AppCompatActivity(), PratoAdapter.OnItemClickListener {
    private var listaPrato = getListaPrato()
    private var adapter = PratoAdapter(listaPrato, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        //TOOLBAR
        val nomeRes = intent.getSerializableExtra("nome") as String
        val imgRes = intent.getSerializableExtra("imagem") as Int
        cardapioImgResTop.setImageResource(imgRes)
        cardapioNomeResTop.text = nomeRes

        //Click back
        cardapioVoltaTop.setOnClickListener {
            finish()
        }

        recyclerPrato.adapter = adapter
        recyclerPrato.layoutManager = GridLayoutManager(this,2)
        recyclerPrato.setHasFixedSize(true)
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, PratoActivity::class.java)
        intent.putExtra("imagem", listaPrato[position].imgPrato)
        intent.putExtra("nome", listaPrato[position].nomePrato)
        intent.putExtra("descrição", listaPrato[position].descricao)
        startActivity(intent)
    }

    fun getListaPrato(): ArrayList<Prato>{
        //Lista de Prato
        return arrayListOf<Prato>(
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore"),
            Prato("Salado com molho de Gengibre", R.drawable.image4, "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore")
        )
    }
}
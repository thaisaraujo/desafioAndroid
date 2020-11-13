package com.example.desafioandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafioandroid.R
import com.example.desafioandroid.domain.Restaurante
import com.example.desafioandroid.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RestauranteAdapter.OnItemClickListener {
    private var listaRestaurante = getListRestaurante()
    private var adapter = RestauranteAdapter(listaRestaurante, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerRestaurantes.adapter = adapter
        recyclerRestaurantes.layoutManager = LinearLayoutManager(this)
        recyclerRestaurantes.setHasFixedSize(true)
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, CardapioActivity::class.java)
        intent.putExtra("imagem", listaRestaurante[position].img)
        intent.putExtra("nome", listaRestaurante[position].nome)
        startActivity(intent)
    }

    fun getListRestaurante(): ArrayList<Restaurante>{
        //Lista de Restaurante
        return arrayListOf<Restaurante>(
            Restaurante("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", R.drawable.image1),
            Restaurante("Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", R.drawable.image4),
            Restaurante("Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo", "Fecha às 00:00", R.drawable.image5),
            Restaurante("Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00", R.drawable.image3),
        )
    }
}
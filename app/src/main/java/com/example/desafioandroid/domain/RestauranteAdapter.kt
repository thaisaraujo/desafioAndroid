package com.example.desafioandroid.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.card_restaurante.view.*


class RestauranteAdapter(private val listaRestaurante : ArrayList<Restaurante>,
                         private val listener: OnItemClickListener):
                         RecyclerView.Adapter<RestauranteAdapter.CardViewHolder>() {

    inner class CardViewHolder(itemView:View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        //Dados do restaurante
        val nomeView : TextView = itemView.nomeRestaurante
        val enderecoView : TextView = itemView.enderecoRestaurante
        val horarioView : TextView = itemView.horarioRestaurante
        val imgView : ImageView = itemView.img_restaurante

        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            //verificar se posicao é valida
            if(adapterPosition != RecyclerView.NO_POSITION){
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val cardView = LayoutInflater.from(parent.context).inflate(R.layout.card_restaurante, parent, false)
        return CardViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        //Passando os dados do restaurante selecionado
        var cardSelecionado = listaRestaurante[position]
        holder.nomeView.text = cardSelecionado.nome
        holder.enderecoView.text = cardSelecionado.endereco
        holder.horarioView.text = cardSelecionado.horario
        holder.imgView.setImageResource(cardSelecionado.img)
    }

    override fun getItemCount() = listaRestaurante.size

    //Posicao do card do restaurante
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
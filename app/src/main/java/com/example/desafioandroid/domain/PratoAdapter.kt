package com.example.desafioandroid.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroid.R
import kotlinx.android.synthetic.main.card_prato.view.*

class PratoAdapter (private val listaPrato : ArrayList<Prato>,
                    private val listener: OnItemClickListener):
                    RecyclerView.Adapter<PratoAdapter.CardViewHolder>() {

    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        //Dados do prato
        val nomeView: TextView = itemView.nomePrato
        val imageView: ImageView = itemView.imgPrato

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
        val cardView = LayoutInflater.from(parent.context).inflate(R.layout.card_prato, parent, false)
        return CardViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        //Passando os dados do restaurante selecionado
        var cardSelecionado = listaPrato[position]
        holder.nomeView.text = cardSelecionado.nomePrato
        holder.imageView.setImageResource(cardSelecionado.imgPrato)
    }


    override fun getItemCount() = listaPrato.size

    //Posicao do card do restaurante
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
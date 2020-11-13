package com.example.desafioandroid.domain

import java.io.Serializable

class Prato (val nomePrato: String, val imgPrato: Int, val descricao: String): Serializable{

    override fun toString(): String {
        return "Prato| nome: '$nomePrato' - descricao:'$descricao'"
    }
}
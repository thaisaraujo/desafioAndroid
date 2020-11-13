package com.example.desafioandroid.domain

import java.io.Serializable

class Restaurante(val nome: String, val endereco: String, val horario: String, val img: Int): Serializable {

    override fun toString(): String {
        return "Restaurante | nome'$nome' - endereco'$endereco' - horario'$horario'"
    }
}
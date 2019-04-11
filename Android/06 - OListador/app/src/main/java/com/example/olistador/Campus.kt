package com.example.olistador

class Campus: Comparable<Campus> {
    lateinit var nome: String
    lateinit var url: String

    constructor(nome: String, url: String){
        this.nome = nome
        this.url = url
    }

    override fun toString(): String {
        return nome
    }

    override fun compareTo(other: Campus): Int {
        return this.nome.compareTo(other.nome)
    }
}
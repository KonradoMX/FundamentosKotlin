package com.msc.fundamentoskotlin.poo

class Smartphone(numero: Int, val esPrivado: Boolean) : Telefono(numero) {

    override fun mostrarNumero() {
        if (esPrivado) println("Desconocido") else super.mostrarNumero()
    }
}
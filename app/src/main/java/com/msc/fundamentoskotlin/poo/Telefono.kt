package com.msc.fundamentoskotlin.poo

open class Telefono (protected val numero: Int) {

    fun llamar(){
        println("Llamando...")
    }

    open fun mostrarNumero() {
        println("Mi número es: $numero")
    }
}
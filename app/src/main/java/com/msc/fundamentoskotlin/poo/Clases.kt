package com.msc.fundamentoskotlin.poo

import com.msc.fundamentoskotlin.nuevoTema

fun main() {
    nuevoTema("Clases")

    val telefono: Telefono = Telefono(33343536)
    telefono.llamar()
    telefono.mostrarNumero()
    //println(telefono.numero)

    nuevoTema("Data classes")
    val usuario = Usuario(0, "Harry", "Potter", Grupos.FAMILIA.ordinal)

    println(usuario.component3())
    println(usuario)
    usuario.name = "Ron"
    println(usuario.component2())

    nuevoTema("Enumeraciones")
    val hermano = usuario.copy(1, "William")
    val amigo = hermano.copy(2, group = Grupos.AMIGOS.ordinal)

    println(hermano)
    println(amigo)

    nuevoTema("Funciones de alcance")
    val smartphone = Smartphone(12345678, true)

    with(smartphone){
        println("¿Es privado? $esPrivado")
        llamar()
    }

    amigo.apply {
        group = Grupos.FAMILIA.ordinal
        name = "Hermione"
        lasName = "Granger"
    }
    println(amigo)


}
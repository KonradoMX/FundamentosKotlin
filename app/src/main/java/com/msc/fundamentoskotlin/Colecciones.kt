package com.msc.fundamentoskotlin

import com.msc.fundamentoskotlin.poo.Grupos
import com.msc.fundamentoskotlin.poo.Usuario

fun main() {
    nuevoTema("Colecciones de sólo lectura")

    val listaFrutas = listOf<String>("Manzana", "Peras", "Uvas", "Mangos")
    println(listaFrutas.get((0..listaFrutas.size - 1).random()))
    println("El índice de las uvas es: ${listaFrutas.indexOf("Uvas")}")

    nuevoTema("Mapas / Diccionarios")

    val mapaUsuarios = mutableMapOf<Int, Usuario>()
    println(mapaUsuarios)

    val usuario = Usuario(0, "Harry", "Potter", Grupos.FAMILIA.ordinal)
    mapaUsuarios.put(usuario.id.toInt(), usuario)
    mapaUsuarios.put(usuario.id.toInt(), usuario)
    println(mapaUsuarios)

    val hermano = usuario.copy(1, "William")
    val amigo = hermano.copy(2, group = Grupos.AMIGOS.ordinal)
    mapaUsuarios.put(amigo.id.toInt(), amigo)
    println(mapaUsuarios)

    mapaUsuarios.remove(2)
    println(mapaUsuarios)
    println(mapaUsuarios.isEmpty())
    println(mapaUsuarios.containsKey(0))

    mapaUsuarios.put(hermano.id.toInt(), hermano)
    mapaUsuarios.put(amigo.id.toInt(), amigo)
    println(mapaUsuarios)
    println(mapaUsuarios.keys)
    println(mapaUsuarios.values)

    val prima = Usuario(0, "Lucia", "Lepe", Grupos.FAMILIA.ordinal)
    mapaUsuarios.put(prima.id.toInt(), prima)
    println(mapaUsuarios)
}

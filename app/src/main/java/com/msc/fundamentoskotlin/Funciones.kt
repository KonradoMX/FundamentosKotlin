package com.msc.fundamentoskotlin

import java.lang.Math.abs

fun main() {
    decirHola()

    nuevoTema("Funciones")
    println(suma(2, 3))

    val n1 = 2
    val n2 = 3

    println("$n1 + $n2 = ${suma(n1, n2)}")
    println("$n1 - $n2 = ${resta(n1, n2)}")

    nuevoTema("InFix")
    val n3 = 3
    println(n3.activarAbsoluto(true))
    println("$n1 + $n3 = ${suma(n1, n3.activarAbsoluto(false))}")

    var absN3 = n3 activarAbsoluto true
    println("Valor absoluto de $n3: $absN3")

    println(n3.identificarNegativo(0))

    nuevoTema("Sobrecarga")
    mostrarProducto("Refresco", promo = "10 %")
    mostrarProducto("Pan")
    mostrarProducto("Dulces", promo = "15%")
    mostrarProducto("Jugo", validez = "30 de abril")
}

fun mostrarProducto(nombre: String, promo: String = "Sin promoción", validez: String = "Agotar existencias") {
    println("$nombre = $promo hasta $validez")
}

infix fun Int.identificarNegativo(num: Int): Boolean = this < 0

infix fun Int.activarAbsoluto(activar: Boolean) = if (activar) abs(this) else this

fun resta(n1: Int, n2: Int) = n1 - n2

fun suma(n1: Int, n2: Int): Int {
    val res = n1 + n2
    return res
}

private fun decirHola(): Unit {
    println("Hola Kotlin")
}
package com.msc.fundamentoskotlin

fun main() {
    nuevoTema("Hola Kotlin")
    nuevoTema("Constantes y Variables")

    val constante = 2
    println("Constante: $constante")

    var variableSinTipo = 5
    println("Variable sin tipo: $variableSinTipo")

    var variableConTipo: Int
    variableConTipo = 10
    println("Variable con tipo: $variableConTipo")

    var variableNula: String?
    variableNula = null
    println(variableNula)

    var cualquierTipo: Any?
    cualquierTipo = 24
    println("Cualquier tipo: $cualquierTipo")
    cualquierTipo = "Veinticuatro"
    println("Cualquier tipo: $cualquierTipo")
}

fun nuevoTema(tema: String){
    print("\n==================== $tema ====================\n")
}
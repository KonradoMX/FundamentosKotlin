package com.msc.fundamentoskotlin

fun main() {
    nuevoTema("Ciclos")
    mostrarPersonas("Hugo", "Paco", "Luis")
    mostrarPersonas("Max", "Checo", "Lewis", "Valtteri", "Fernando", "Nikita")
}

fun mostrarPersonas(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

fun mostrarPersonas(vararg personas: String) {
    nuevoTema("Ciclo for")
    for(persona in personas) println(persona)

    nuevoTema("Ciclo While")
    var indice = 0
    while(indice < personas.size) {
        println(personas[indice])
        indice ++
    }

    nuevoTema("when")
    indice = (0..personas.size - 1).random()
    println(indice)

    when (personas[indice]) {
        "Lewis" -> println(personas[indice] + " Siete veces campeón")
        "Checo" -> {
            println(personas[indice])
            println("¡Es mexicano!")
            println("Y de Guadalajara")
        }
        else -> println(personas[indice])
    }
}

package com.exercicio.kotlinanimal.testes

import com.exercicio.kotlinanimal.Animal
import com.exercicio.kotlinanimal.AnimalCaracteristicas
import com.exercicio.kotlinanimal.AnimalTipo

fun main() {
    val gato = AnimalCaracteristicas(
        nome = "Gato",
        cadeiaAlimentar = "Predador",
        AnimalTipo.TERRESTRE

    )
    println(gato)
}
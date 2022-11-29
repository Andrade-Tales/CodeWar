package com.exercicio.kotlinanimal.testes

import com.exercicio.kotlinanimal.AnimalCaracteristicas
import com.exercicio.kotlinanimal.AnimalTipo

fun main() {
    val gato = AnimalCaracteristicas(
        nome = "Gato",
        cor = "Preto",
        mediaVida = 19,
        cadeiaAlimentar = "Predador",
        AnimalTipo.TERRESTRE

    )
    println(gato)
}
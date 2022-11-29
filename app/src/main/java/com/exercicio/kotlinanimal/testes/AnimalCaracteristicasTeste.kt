package com.exercicio.kotlinanimal.testes

import com.exercicio.kotlinanimal.AnimalTipo

fun main() {
    AnimalTipo.values().forEach {
        println("${it.name} é ${it.descricao}")
    }
}
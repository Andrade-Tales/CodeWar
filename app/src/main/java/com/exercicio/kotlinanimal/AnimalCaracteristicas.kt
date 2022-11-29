package com.exercicio.kotlinanimal

class AnimalCaracteristicas(
    nome: String,
    cadeiaAlimentar: String,
    val animalTipo: AnimalTipo
) : Animal(nome, cadeiaAlimentar) {

    override fun toString(): String = """
        Nome: $nome
        CadeiaAlimentar: $cadeiaAlimentar
        Tipo: ${animalTipo.descricao}
    """.trimIndent()
}
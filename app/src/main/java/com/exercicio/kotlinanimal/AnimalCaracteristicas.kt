package com.exercicio.kotlinanimal

class AnimalCaracteristicas(
    nome: String,
    val cor: String,
    val mediaVida: Int,
    cadeiaAlimentar: String,
    val animalTipo: AnimalTipo
) : Animal(nome, cadeiaAlimentar) {

    override fun toString(): String = """
        Nome: $nome
        Cor: $cor
        Media de vida: $mediaVida
        Cadeia alimentar: $cadeiaAlimentar
        Tipo: ${animalTipo.descricao}
    """.trimIndent()
}
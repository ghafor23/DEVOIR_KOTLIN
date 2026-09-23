package TP7

fun String.containsSubstring(substring: String): Boolean {
    return contains(substring)
}

fun main() {
    val chaine1 = "Bonjour tout le monde"
    val chaine2 = "Kotlin est un langage de programmation"

    println(chaine1.containsSubstring("Bonjour"))
    println(chaine1.containsSubstring("Kotlin"))

    println(chaine2.containsSubstring("Kotlin"))
    println(chaine2.containsSubstring("Java"))
}
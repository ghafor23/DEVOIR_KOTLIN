package TP7

fun main() {
    val liste = mutableListOf<String>()
     liste.add("Kotlin")
     liste.add("Java")
     liste.add("Python")
     liste.add("PHP")

    liste.remove("Java")

    val recherche = "Kotlin"

    if (liste.contains(recherche)) {
        println("$recherche existe dans la liste")
    } else {
        println("$recherche n'existe pas dans la liste")
    }

    println("Taille de la liste : ${liste.size}")
    println("Contenu de la liste : $liste")
}
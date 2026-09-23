package TP7

fun main() {
    val utilisateurs = mutableMapOf<String, Int>()

    utilisateurs["Ali"] = 20
    utilisateurs["Sara"] = 22
    utilisateurs["Youssef"] = 19
    utilisateurs["Amine"] = 25

    utilisateurs.remove("Sara")

    val age = utilisateurs["Ali"]

    println("Age de Ali : $age")
    println("Clés : ${utilisateurs.keys}")
    println("Valeurs : ${utilisateurs.values}")
}
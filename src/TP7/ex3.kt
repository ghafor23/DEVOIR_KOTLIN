package TP7

fun main() {
    val nombres = mutableSetOf<Int>()

    nombres.add(10)
    nombres.add(20)
    nombres.add(30)
    nombres.add(40)

    nombres.remove(20)

    val present = nombres.contains(30)

    println("Le nombre 30 est présent : $present")
    println("Contenu de l'ensemble : $nombres")
}
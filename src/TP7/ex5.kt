package TP7

fun main() {
    val nombres = mutableListOf<Int>()

    nombres.add(30)
    nombres.add(10)
    nombres.add(50)
    nombres.add(20)
    nombres.add(40)

    val listeImmuable = nombres.toList()

    nombres.sort()

    println("Liste triée : $nombres")
    println("Liste immuable : $listeImmuable")
}
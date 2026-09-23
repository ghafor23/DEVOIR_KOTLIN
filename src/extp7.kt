package TP7

fun String.containsSubstring(substring: String): Boolean {
    return this.contains(substring)
}

fun main() {
    val message = "Bienvenue dans le développement Android avec Kotlin"
    val texte = "Programmation Orientée Objet"

    val contientKotlin = message.containsSubstring("Kotlin")
    val contientJava = message.containsSubstring("Java")
    val contientObjet = texte.containsSubstring("Objet")
    val contientPython = texte.containsSubstring("Python")

    println("Le message contient 'Kotlin' ? $contientKotlin")
    println("Le message contient 'Java' ? $contientJava")
    println("Le texte contient 'Objet' ? $contientObjet")
    println("Le texte contient 'Python' ? $contientPython")
}
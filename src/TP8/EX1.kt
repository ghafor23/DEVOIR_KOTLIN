package TP8

enum class TypeAnimal {
    TERRESTRE,
    VOLANT,
    AQUATIQUE
}

interface Volant {
    fun voler(): String
}

interface Aquatique {
    fun nager(): String
}

sealed class Animal(
    val nom: String,
    val espece: String,
    val type: TypeAnimal
)

data class Terrestre(
    val nomAnimal: String,
    val especeAnimal: String
) : Animal(nomAnimal, especeAnimal, TypeAnimal.TERRESTRE)

data class VolantAnimal(
    val nomAnimal: String,
    val especeAnimal: String
) : Animal(nomAnimal, especeAnimal, TypeAnimal.VOLANT), Volant {

    override fun voler(): String {
        return "$nom vole"
    }
}

data class AquatiqueAnimal(
    val nomAnimal: String,
    val especeAnimal: String
) : Animal(nomAnimal, especeAnimal, TypeAnimal.AQUATIQUE), Aquatique {

    override fun nager(): String {
        return "$nom nage"
    }
}

fun ajouterAnimal(liste: MutableList<Animal>, animal: Animal) {
    liste.add(animal)
}

fun main() {

    val animaux = mutableListOf<Animal>()

    val lion = Terrestre("Simba", "Lion")

    val oiseau = VolantAnimal("Rio", "Perroquet")

    // 7. Créer un animal aquatique
    val dauphin = AquatiqueAnimal("Flipper", "Dauphin")

    ajouterAnimal(animaux, lion)
    ajouterAnimal(animaux, oiseau)
    ajouterAnimal(animaux, dauphin)

    println(animaux)

    println(oiseau.voler())

    println(dauphin.nager())
}
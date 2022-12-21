package com.dltastudio
import java.util.Scanner

class LaBonnePaye {
    private var lesJoueurs : MutableList<Joueur>
    private var plateau : Plateau
    private var gobelet : Gobelet

    private val nomPions = arrayOf("Voiture","Cheval","Avion","Chat","Vélo","Vache","Cochon","Poule","Bateau")

    init {
        gobelet=Gobelet()
        plateau=Plateau()
        lesJoueurs=mutableListOf<Joueur>()
        for (i in 1..4) {
            lesJoueurs.add(Joueur("Joueur ${i}",nomPions[i] , plateau.getCaseDepart()))
        }
    }

    fun jouer() {
        for (joueur in lesJoueurs)
        {
            joueur.jouer(gobelet)
        }
    }

    fun getJoueurs() : List<Joueur> {
        return lesJoueurs
    }
}

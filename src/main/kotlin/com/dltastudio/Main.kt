package com.dltastudio

import java.util.*

fun main(args:Array<String>) {

    val jeu = LaBonnePaye()

    for (i in 1..20) {
        jeu.jouer()
    }

    println("============ CLASSEMENT ====================");
    for  (joueur in jeu.getJoueurs()) {
        println("Joueur ${joueur.getNom()} avec la fortune ${joueur.getFortune()}")
    }
    println("=============================================");
}


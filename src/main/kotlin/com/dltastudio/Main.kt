package com.dltastudio

import java.util.*

fun main(args:Array<String>) {


    var indice = 0
    val laBonnePaye = LaBonnePaye()
    var tour = 1
    do{
        println("Tour $tour")
        laBonnePaye.tabJoueur.forEach { joueur -> joueur.Jouer() }
        tour +=1
        indice += 1
    }while(indice < 20)



}

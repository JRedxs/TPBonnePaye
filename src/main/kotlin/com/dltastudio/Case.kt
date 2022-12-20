package com.dltastudio

class Case{

    private val nom: Int
    val arr = Array(31) { i -> (1 * i+1) }

    constructor(NewCase: Int){
        this.nom = NewCase
    }

    fun getNom(): Int{
        return nom
    }

    fun arretSur(){

        val joueur = Joueur("","",650,true)
    }

}
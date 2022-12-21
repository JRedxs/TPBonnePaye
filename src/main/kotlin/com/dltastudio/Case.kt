package com.dltastudio

open class Case(private val nom : String) {
    private lateinit var caseSuivante: Case

    fun getNom() : String {
        return nom
    }

    fun getCaseSuivante() : Case {
        return caseSuivante
    }

    fun setCaseSuivante(caseSuivante : Case) {
        this.caseSuivante = caseSuivante
    }

    open fun arretSur(joueur: Joueur){

    }
}

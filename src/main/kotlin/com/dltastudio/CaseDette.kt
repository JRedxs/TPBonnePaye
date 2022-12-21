package com.dltastudio

class CaseDette : Case{
    private val montant : Int
    constructor(nom: String,montant: Int) : super(nom){
        this.montant=montant
    }

    override fun arretSur(joueur: Joueur) {
        joueur.setFortune(joueur.getFortune()-montant)
    }
}
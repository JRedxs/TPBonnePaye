package com.dltastudio

class Joueur {
    private var nom : String
    private var pion : String
    private var fortune: Int
    private var passerTour: Boolean
    private var caseCourante : Case = Case(0)

    constructor(nom: String, pion: String,fortune: Int,passerTour: Boolean){
        this.nom = nom
        this.pion = pion
        this.fortune = fortune
        this.passerTour = passerTour
    }

    fun setFortune(){
        this.fortune = fortune
    }

    fun getFortune(): Int {
        return fortune;
    }

    fun setPasserTour(){
        this.passerTour = passerTour
    }

    fun getPasserTour(): Boolean{
        return passerTour;
    }

    fun Jouer(){
        val gob = Gobelet()
        gob.lancer()
        val valeurFace = gob.getValeurFace()
        caseCourante = Case(caseCourante.getNom() + valeurFace)
        if(caseCourante.getNom() >= 31 ) {
            println("Le joueur $nom recommence un nouveau mois")
            caseCourante = Case(0)
        }else{
            println("Le joueur $nom à fait $valeurFace il est sur la case ${caseCourante.getNom()}")
        }





    }
}
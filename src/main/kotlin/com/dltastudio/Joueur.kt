package com.dltastudio

class Joueur(
    private var nom : String,
    private var pion : String,
    private var caseCourante : Case) {


    fun jouer(gobelet : Gobelet) {
        var valeurGobelet : Int

        gobelet.lancer()
        valeurGobelet=gobelet.getValeurFace()
        for (i in 1..valeurGobelet) {
            caseCourante=caseCourante.getCaseSuivante()
        }
        println("Joueur ${nom} s'arrête sur la case ${caseCourante.getNom()}")
    }
}

package com.dltastudio

class Joueur(
    private var nom : String,
    private var pion : String,
    private var caseCourante : Case ) {


    private var fortune: Int
    private var passerTour: Boolean

    init {  //Initialisation des valeurs
        fortune = 650
        passerTour = false

    }

    fun jouer(gobelet: Gobelet) {
        if (false == passerTour) {
            var valeurGobelet: Int

            gobelet.lancer()
            valeurGobelet = gobelet.getValeurFace()
            for (i in 1..valeurGobelet) {
                caseCourante = caseCourante.getCaseSuivante()
            }
            caseCourante.arretSur(this)
            println("Joueur ${nom} s'arrête sur la case ${caseCourante.getNom()}")
        } else {
            passerTour = false
            println("Joueur ${nom} passe son tour")
        }
    }

        fun getFortune(): Int {
            return fortune;
        }

        fun setFortune(fortune: Int) {
            this.fortune = fortune
        }

        fun setPasserTour(passerTour: Boolean) {
            this.passerTour = passerTour
        }

        fun getNom(): String {
            return nom
        }


}
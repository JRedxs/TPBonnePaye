package com.dltastudio

class CaseDimanche : Case("Dimanche"){

    override fun arretSur(joueur: Joueur){
        joueur.setPasserTour(true)
    }

}
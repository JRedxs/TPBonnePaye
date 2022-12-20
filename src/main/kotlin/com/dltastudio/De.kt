package com.dltastudio

import java.util.*

class De {
    private var valeurFace : Int
    private val random : Random

    constructor(){
        valeurFace=0
        random = Random()
    }

    fun getValeurFace() : Int {
        return valeurFace;
    }


    fun lancer(){
        valeurFace = random.nextInt(6) + 1
    }




}
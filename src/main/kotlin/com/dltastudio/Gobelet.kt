package com.dltastudio


class Gobelet {

    private val de1 : De
    private val de2 : De

    constructor() {
        de1 = De()
        de2 = De()
    }

    fun lancer(){
        de1.lancer()
        de2.lancer()
    }

    fun getValeurFace() : Int {
        return de1.getValeurFace()+de2.getValeurFace()
    }


}
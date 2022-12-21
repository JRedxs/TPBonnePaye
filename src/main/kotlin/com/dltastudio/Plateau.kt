package com.dltastudio


class Plateau {
    private var lesCases : MutableList<Case>

    constructor() {
        var previousCase : Case? = null
        var newCase : Case


        newCase=Case("foo") // initialisation pour compilation
        lesCases= mutableListOf()

        for (i in 1..31) {
            val nomCase = "Case ${i}"

            newCase = when (i) {
                5 -> CaseDimanche()

                10,15,20,25 -> CaseDette(nomCase,(10*i))

                8,13,21,24,27 -> CaseRevenu(nomCase,(10*i))

                else -> Case(nomCase)

            }

            lesCases.add(newCase)
            previousCase?.let {
                it.setCaseSuivante(newCase)
            }
            previousCase=newCase
        }
        newCase.setCaseSuivante(getCaseDepart())

    }

    fun getCaseDepart() : Case
    {
        return lesCases[0]
    }
}

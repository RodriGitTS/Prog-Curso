package Naves.Elementos

import Naves.Elementos.Cuadrante

class Tierra {
    var cuadrantes: ArrayList<Cuadrante>

    constructor(){
        cuadrantes=ArrayList()
    }
    fun iniciar(){
        for (i in 1..3){
            for (j in 1..3){
                cuadrantes.add(Cuadrante(i,j))
            }
        }
    }
}
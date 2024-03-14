package Naves.Elementos

import Naves.Dron
import kotlin.collections.ArrayList
import kotlin.random.Random

class Cuadrante {
    val posicionX:Int
    val posicionY:Int
    var drones: ArrayList<Dron>
    var mecanico:String
    var supervisora:String

    constructor(posicionX:Int,posicionY: Int){
        this.posicionX=posicionX
        this.posicionY=posicionY
        drones=addDrones()
        mecanico="Jack$posicionX$posicionY"
        supervisora="Vika$posicionX$posicionY"
    }
    private fun addDrones():ArrayList<Dron>{
        for (i in 1..Random.nextInt(1,3)){
            drones.add(Dron())
        }
        return drones
    }

}
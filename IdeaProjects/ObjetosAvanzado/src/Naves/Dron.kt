package Naves

import kotlin.random.Random

class Dron {
    var numero:Int
    var operativo: Boolean

    constructor(){
        numero= Random.nextInt(1,1000)
        operativo=false
    }
}
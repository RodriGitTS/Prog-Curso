
//ACTIVIDAD 1

import kotlin.math.sqrt

class Metro {
    var estadoActual = PARADO
        private set

    fun cambiarSiguienteEstado(){
        estadoActual= when(estadoActual){
            PARADO -> ARRANCANDO
            ARRANCANDO -> EN_MARCHA
            EN_MARCHA -> PARANDO
            PARANDO -> PARADO
            else -> throw RuntimeException("Estado desconocido")
        }
    }
    companion object {
        protected const val PARADO = 0
        protected const val ARRANCANDO = 1
        protected const val EN_MARCHA = 2
        protected const val PARANDO = 3
    }

}




//ACTIVIDAD 2

class Figura {
    var a = 0.0
    var b = 0.0
    var r = 0.0


    fun calculateArea(shape: String): Double {
        var area = 0.0
        when (shape.uppercase()) {
            SQUARE -> area = a * a
            RECTANGLE -> area = a * b
            CIRCLE -> area = Math.PI * r * r
        }
        return area
    }

    companion object {
        private const val SQUARE = "SQUARE"
        private const val RECTANGLE = "RECTANGLE"
        private const val CIRCLE = "CIRCLE"
    }

}


class GeneradorPrimos {

    fun generarPrimos(max: Int): IntArray {
        var i: Int
        var j: Int
        return if (max >= 2) {
            // Declaraciones
            val dimensionArray = max + 1 // Tamaño del array
            // Inicializar el array
            val esPrimo = BooleanArray(dimensionArray){true}
            // Eliminar el 0 y el 1, que no son primos
            esPrimo[1] = false
            esPrimo[0] = false
            // Criba de numeros
            val espacioRestante=sqrt(dimensionArray.toDouble()) + 1
            i = 2
                while (i <espacioRestante ) {
                    // Eliminar los múltiplos de i
                    j = 2 * i
                    while (j < dimensionArray) {
                        esPrimo[j] = false
                        j += i
                    }
                i++
            }
            // ¿Cuántos primos hay?
            var contNumPrimos = 0

            //Si es primo se suma al contador
            for (i in 0..<dimensionArray) {
                if (esPrimo[i]) {contNumPrimos++}
            }

            //Añadimos el resutado en el array
            val nPrimos = IntArray(contNumPrimos)
            i = 0
            j = 0
            while (i < dimensionArray) {
                if (esPrimo[i])
                    nPrimos[j++] = i
                    i++
            }
            nPrimos
        } else { // max < 2
            IntArray(0)
            // Vector vacío
        }
    }
}
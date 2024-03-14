package poligonos

/**
 * Poligono
 *
 * @constructor Create empty Poligono,
 * Clase base de la que derivan las siguientes
 *
 * ----Propiedades solicitadas----
 * 2 Constructores
 * 2 Metodos de clase: Obtener superficie y perimetro
 *
 *
 */
abstract class Poligono {
     protected var color: Color
     abstract var lados:Int
     protected var longLado:Int

    //Indicando color y longitud del lado
    constructor(color: Color, lonLado: Int){
        this.color=color
        this.longLado=lonLado
    }

    constructor(lonLado: Int){
        this.color= Color.NEGRO
        this.longLado=lonLado
    }


    fun agrandarLongitud(lon:Int){
        println("Longitud aumentada $lon cm!")
        longLado+=lon
    }
    fun reducirLongitud(lon: Int){

        var nuevaLon=longLado-lon
        //Nunca menos de 0

        if (nuevaLon<=0){
            // (Crear clasePoligonoExcepcion para tener tu propia excepcion)
           throw Exception("No se pudo reducir longitud: Dato incorrecto")
        }else {
            longLado=nuevaLon
            println("Logitud reducida a $longLado")
        }
    }


    abstract fun obtenerPerimetro():Int
    /**
     * Obtener superficie
     *
     * @return
     * metodo para ser heredado por los diferentes polígonos
     */
    abstract fun obtenerSuperficie(): Int

    override fun toString(): String {
        return "color=$color, lados=$lados, longLado=$longLado"
    }
}












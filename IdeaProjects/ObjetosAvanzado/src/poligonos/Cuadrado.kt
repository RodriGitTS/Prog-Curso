package poligonos
/**
 * Cuadrado
 *
 * @constructor Create empty Cuadrado,
 * Poligono de 4 lados con
 * metodo "obtenerSuperficie modificado
 *
 */
class Cuadrado: Poligono {

    //Cuadrado inicializa sus lados a 4
    override var lados=4


    //Constructores con los mismos parametros que la clase papa
    constructor(color: Color, lonLado: Int):super(color, lonLado)
    constructor(lonLado: Int):super(lonLado)

    override fun obtenerSuperficie(): Int {
        println("La superficie del cuadrado es ${longLado*longLado}")
        return longLado*longLado
    }
    override fun obtenerPerimetro(): Int {
        println("Perimetro calculado")
        return longLado*lados
    }
    override fun toString(): String {
        return "Cuadrado(${super.toString()})"
    }

}
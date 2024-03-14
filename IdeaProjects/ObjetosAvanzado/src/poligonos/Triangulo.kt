package poligonos

/**
 * Triangulo (Equilatero)
 *
 * @constructor Create empty
 * Triangulo, poligono de 3 lados con metodo
 * y atributo propio
 */
class Triangulo: Poligono {

    //Nuevo parametro y numero de lados inicializado a 3
    var altura: Int
    override var lados=3


    //Constructores
    constructor(lonLado: Int) : super(lonLado) {
        this.altura = lonLado
    }
    constructor(color: Color, lonLado: Int, altura: Int) : super(color, lonLado) {
        this.altura = altura
    }

    //Metodos
    override fun obtenerSuperficie(): Int {
        println("la superficie del triangulo es ${(longLado * altura) / 2}")
        return (longLado * altura) / 2
    }
    override fun obtenerPerimetro(): Int {
        return longLado*lados
    }
    override fun toString(): String {
        return "triangulo(${super.toString()} altura=$altura)"
    }
}
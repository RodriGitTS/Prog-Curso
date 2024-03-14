package Naves

abstract class Orden {
    abstract var posicion: Pair<Int,Int>
    abstract var completada: Boolean
    abstract var nDron: Int
    abstract var tipo: Tipo
}
package poligonos

/**
 * PoligonoAPP
 *
 * @constructor Create empty PoligonoAPP
 * Objeto para usar los poligonos
 */
class PoligonoAPP {

        var lista:ArrayList<Poligono>

        constructor(){
            this.lista=prepararLista()
        }
        //Se añaden los poligonos pedidos
        private fun prepararLista():ArrayList<Poligono>{
            var lista=ArrayList<Poligono>()

            lista.add(Triangulo(3))
            lista.add(Triangulo(Color.NEGRO,10,8))
            lista.add(Cuadrado(20))

            return lista
        }

        //Metodo pedido en el enunciado
        fun sumaAreas(){
            var result=0
            for (i in lista.indices) {
                var superficie=lista[i].obtenerSuperficie()
                result+=superficie
            }
            println("La superficie total es $result")
        }


    //Podria usarse un override del metodo toString,
    // pero quiero hacerlo mas bonito
    fun mostrarLista(){
        for (i in lista.indices){
            println(lista[i].toString())
        }
    }
}



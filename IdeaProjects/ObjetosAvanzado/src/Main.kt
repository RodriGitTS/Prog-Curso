import CuentaBancaria.CuentaCorriente
import poligonos.PoligonoAPP
/**
 * Main
 *
 * Para validar y verificar que PoligonoAPP funciona correctamente
 */
fun main(){

    println(1200)
   var pApp= PoligonoAPP()
    //Poligonos creados previamente al iniciarse la clase
    //            lista.add(Triangulo(3))
    //            lista.add(Triangulo(Color.NEGRO,10,8))
    //            lista.add(Cuadrado(20))
    println(pApp.mostrarLista())
    println(pApp.sumaAreas())
    var cuenta=CuentaCorriente("","",3)

}

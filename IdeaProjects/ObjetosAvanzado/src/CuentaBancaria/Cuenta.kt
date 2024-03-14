package CuentaBancaria

import kotlin.random.Random

abstract class Cuenta {

    var nombre:String
    var apellidos:String
    var saldoActual:Int
    var nCuenta: String

    constructor(nombre:String,apellidos:String,saldoInicial:Int ){
        this.nombre=nombre
        this.apellidos=apellidos
        this.saldoActual=saldoInicial
        this.nCuenta=crearNcuenta()
    }
    private fun crearNcuenta():String{

        var cont=0
        while (cont<0){
            this.nCuenta+=(Random.nextInt(0,127).digitToChar())
            cont++
        }
        return this.nCuenta
    }

    override fun toString(): String {
        return "Cuenta(nombre='$nombre', apellidos='$apellidos', saldoActual=$saldoActual, nCuenta='$nCuenta')"
    }
    open fun retirarEfectivo(cantidad:Int){
        this.saldoActual-=cantidad
    }
    open fun ingresarEfectivo(cantidad: Int){
        this.saldoActual+=cantidad
    }
     protected fun getSaldo():Int{
        return this.saldoActual
    }
     protected fun setSaldo(saldo:Int){
        this.saldoActual=saldo
    }
    //Hacer menu(interfaz imagino)
    //Terminar el resto del ejercicio

}
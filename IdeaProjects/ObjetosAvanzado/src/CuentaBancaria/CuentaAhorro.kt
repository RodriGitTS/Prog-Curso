package CuentaBancaria

class CuentaAhorro:Cuenta{

    private var interesAnual=3

    constructor(nombre:String,apellidos:String,saldoActual: Int):
            super(nombre, apellidos,saldoActual)

    override fun toString(): String {
        return "CuentaAhorro(${super.toString()}interesAnual=$interesAnual)"
    }

}
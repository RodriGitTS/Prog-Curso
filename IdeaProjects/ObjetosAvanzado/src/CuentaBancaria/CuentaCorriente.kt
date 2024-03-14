package CuentaBancaria

class CuentaCorriente: Cuenta {
    private val comision=4
    private val max=10
    private val interes=2
    private val comisionFija=1

    constructor(nombre:String,apellidos:String,saldoActual: Int):
            super(nombre, apellidos,saldoActual)

    override fun retirarEfectivo(cantidad: Int) {
        if (super.getSaldo()>0){
            setSaldo(super.getSaldo()+cantidad)
        }
    }

    override fun toString(): String {
        return "CuentaCorriente( ${super.toString()} comision=$comision, max=$max, interes=$interes, comisionFija=$comisionFija)"
    }


}
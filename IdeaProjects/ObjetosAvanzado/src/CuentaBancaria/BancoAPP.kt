package CuentaBancaria

class BancoAPP {
        var cuentas=ArrayList<Cuenta>()

    fun menu() {
        var salir = false
        var opcion: Int
        while (!salir) {
            opcion=readln().toInt()
            when (opcion) {
                1 -> addCuenta()
                2 -> ingresarDineroCuenta()
                3 -> retirarDineroCuenta()
                4->  salir=true
            }
        }
    }

    fun ingresarDineroCuenta(){
        println(cuentas.toString())
        println("Ingresa un numero de cueta")
        var nCuenta= readln().toInt()
        var encontrada=false
        while (!encontrada){
            for (i in cuentas.indices){
                if (nCuenta.equals(cuentas[i].nCuenta))
                    println("Ingresa la cantidad")
                    var efectivo= readln().toInt()
                    cuentas[i].ingresarEfectivo(efectivo)
                    encontrada=true
                }
            }
            if (!encontrada){
                println("No existe esa cuenta")
            }
        }


        fun retirarDineroCuenta(){
            println(cuentas.toString())
            println("Ingresa un numero de cueta")
            var nCuenta= readln().toInt()
            var encontrada=false

            while (!encontrada){
                for (i in cuentas.indices){
                    if (nCuenta.equals(cuentas[i].nCuenta))
                        println("Ingresa la cantidad")
                    var efectivo= readln().toInt()
                    cuentas[i].retirarEfectivo(efectivo)
                    encontrada=true
                }
            }

            if (!encontrada){
                println("No existe esa cuenta")
            }
    }

    fun addCuenta(){
        println("Nombre")
        var nombre= readln()
        println("Apellidos")
        var apellidos= readln()
        println("Saldo inicial")
        var saldo= readln().toInt()
        println("Tipo de cuenta")
        var tipo=""
        while (tipo!="CORRIENTE" && tipo!="AHORRO"){
            tipo= readln()
            when(tipo.uppercase()){
                "CORRIENTE"->cuentas.add(CuentaCorriente(nombre,apellidos,saldo))
                "AHORRO"-> cuentas.add(CuentaAhorro(nombre,apellidos,saldo))
                else-> println("No es un tipo de cuenta")
            }
        }

    }

    override fun toString(): String {
        return "BancoAPP(cuentas=$cuentas)"
    }

}


interface InterfaceA{
    fun funD(){ println("InterfazA")
    }
}
interface InterfaceB{
    fun funD(){
        println("InterfazB")
    }
}

class classA: InterfaceA,InterfaceB {

    override fun funD() {
        super<InterfaceA>.funD()
    }

}
fun main(){
    var clas=classA()

    clas.funD()
}


//Atributos de los objetos
class fecha{
    private var dia:Int
    private var mes:Int
    private var anio:Int

    constructor(){
        this.dia=0
        this.mes=0
        this.anio=0
    }
    fun setDia(dia: Int){
        this.dia=dia
    }
    fun setMes(mes: Int){
        this.mes=mes
    }
    fun setAnio(anio: Int){
        this.anio=anio
    }

    override fun toString(): String {
        return "fecha(dia=$dia, mes=$mes, anio=$anio)"
    }
}
interface prestamos{
    fun prestar()
    fun prestado():Boolean
    fun devolver()
}

//Objetos
open class Publicacion {
    private var ISBN: String
    private var titulo: String
    private var publicacion: fecha

    constructor(){
        this.ISBN=""
        this.titulo=""
        this.publicacion=fecha()
    }
    constructor(ISBN: String, Titulo: String, fecha: fecha){
        this.ISBN=ISBN
        this.titulo=Titulo
        this.publicacion=fecha
    }
    fun getISB():String{
        return this.ISBN
    }
    fun getTitulo():String{
        return this.titulo
    }
    fun setISBN(ISBN:String){
        this.ISBN=ISBN
    }
    fun setTitulo(Titulo:String){
        this.titulo=Titulo
    }
    fun setAnio(dia:Int,mes:Int,anio:Int){
        publicacion.setDia(dia)
        publicacion.setMes(mes)
        publicacion.setAnio(anio)
    }

    override fun toString(): String {
        return "Publicacion(ISBN='$ISBN', titulo='$titulo', publicacion=$publicacion)"
    }
}
class Revista:Publicacion{
    private var nRevista:Int
    constructor(){
        nRevista=0
    }

    override fun toString(): String {
        return "Revista(${super.toString()} Revista=$nRevista)"
    }

}
class Libro:Publicacion,prestamos{
    private var prestado:Boolean

    constructor(){
        this.prestado=false
    }

    constructor(ISBN: String, Titulo: String, fecha: fecha):super(){
        this.prestado=false
    }
    override fun prestado():Boolean{ return this.prestado }
    override fun prestar(){ this.prestado=true }
    override fun devolver(){this.prestado=false}
    override fun toString(): String {
        return "Libro( ${super.toString()} prestado=$prestado)"
    }
}

//Clase con los objetos
class Biblioteca{
    var coleccion:ArrayList<Publicacion>

    constructor(){
        this.coleccion=ArrayList<Publicacion>()
    }
    fun listarLibrosNoPrestados(){
        for (i in coleccion.indices){
            var libro=coleccion[i]
            if (libro is Libro && !libro.prestado()){
                println(libro.toString())
            }
        }
    }
    fun listarPublisPorLetra(){
        println("Escribe la letra")
        var letra= readln()
        for (i in coleccion.indices){
            if (coleccion[i].getTitulo().startsWith(letra)){
                println(coleccion[i].toString())
            }
        }
    }
    fun listarPublisPorCadena(){
        println("Escribe lo que buscas")
        var cadena= readln()
        for (i in coleccion.indices){
            if (coleccion[i].getTitulo().contains(cadena)){
                println(cadena[i].toString())
            }
        }
    }
    fun menu(){
        var salir=false
        while (!salir){
            println("1-Añadir libro")
            println("2-Añadir revista")
            println("3-Listar libros no prestados")
            println("4-Listar publicaciones cuyo título empieza por la letra indicada")
            println("5-Buscar publicación, a partir de una cadena que forme parte del título")
            println("6-Eliminar publicación de la biblioteca")
            println("7-Salir")
            var opcion= readln().toInt()
            when(opcion){
                1->addLibro()
                2->addRevista()
                3->listarLibrosNoPrestados()
                4->listarPublisPorLetra()
                5->listarPublisPorCadena()
                6->delPubli()
                7->salir=true
            }
        }
    }
    fun delPubli(){
        coleccion.toString()
        println("Elige la pubicacion que quieres borrar")
        var eleccion= readln().toInt()
        coleccion.removeAt(eleccion)
    }
    fun addLibro(){
        var fecha=fecha()
        println("ISBN")
        var isbn= readln()
        println("Titulo")
        var titulo= readln()
        println("Fecha de publicacion")
        println("Dia")
        var dia= readln().toInt()
        println("Mes")
        var mes= readln().toInt()
        println("Anio")
        var anio= readln().toInt()
        fecha.setDia(dia)
        fecha.setMes(mes)
        fecha.setAnio(anio)
        coleccion.add(Libro(isbn,titulo,fecha))
    }
    fun addRevista(){
        var nuevaRevista=Revista()
        println("ISBN")
        var isbn= readln()
        nuevaRevista.setISBN(isbn)
        println("Titulo")
        var titulo= readln()
        nuevaRevista.setTitulo(titulo)
        println("Fecha de publicacion")
        println("Dia")
        var dia= readln().toInt()
        println("Mes")
        var mes= readln().toInt()
        println("Anio")
        var anio= readln().toInt()
        nuevaRevista.setAnio(dia, mes, anio)

        coleccion.add(nuevaRevista)
    }

    override fun toString(): String {
        return "Biblioteca(coleccion=$coleccion)"
    }

}

fun main(){
    var Biblioteca=Biblioteca()
}

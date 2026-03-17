
// en comparación a Java, no necesitamos poner public antes de la clase.
// la clase es por defecto public y final - para heredar se usa open

class Estudiante {
    var nombre = ""
    var edad = 0

    fun estudiar(){
        println("$nombre está estudiando")
    }

    // encapsulamiento! ponemos de forma privada los atributos
    class Asignatura(private val nombre: String, private val precio: Double) {
        fun getNombre(): String {
            return "La asignatura se llama: $nombre"
        }
        fun getPrecio(): Double{
            return precio
        }
    }
}

fun main(){

    // es val, no cambiamos la referencia
    val estudiante = Estudiante()
    estudiante.nombre="Fulanito Sutano"
    estudiante.edad=23
    estudiante.estudiar()

    val poo = Estudiante.Asignatura("POO",250.0)
    println(poo.getNombre())
    println(poo.getPrecio())

}

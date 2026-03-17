open class Persona(
    private var nombre: String = "", private var apellido: String = ""
){
    fun saludar(): String {
        return "Hola mi nombre es " +
                "$nombre $apellido, mucho gusto"
    }
}

// los dos puntos es el sustituto de "extend", solo el atributo que es propio de esta clase
// y no lo hereda se le agrega var/val
class Empleado(nombre: String, apellido: String, var rol: String): Persona(nombre,apellido) {

}

fun main(){
    val empleado = Empleado("Jose", "García", "Docente")
    print(empleado.saludar())
}
data class Student(
    val cif: String,
    val nombre: String,
    val carrera: String,
    val promedio: Double
){
    fun saludar(): String{
        return "$cif, $nombre"
    }
}

fun main() {
    val fulanity = Student(
        "234",
        "Fulanity",
        "Filología",
        90.0
    )
}
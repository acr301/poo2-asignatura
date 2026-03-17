package ej1

/*
    para carnet, mayor y year
    pide inicializar las propiedades de la clase
    ya sea con un valor o un nulable Tipo?
    deben inicializarse en el momento de la declaración,
    en el bloque init
 */

class Student {
    var name: String = ""
    var carnet: Int = 0;
    var mayor: String = ""
    var year: Int = 0;

    override fun toString(): String {
        return "Student ( name='$name', carnet='$carnet', mayor='$mayor', year='$year' )"
    }

    fun showInfo(){
        println(toString()) // o println(this)
    }
}
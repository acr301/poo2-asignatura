package ej4

class Programmer(name: String, income: Double, val language: String): Employee(name,income) {
    override fun showInfo(){
        println(toString() + ", $language")
    }
}
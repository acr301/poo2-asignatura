package ej4

open class Employee(name1: String, income1: Double) {
    private var name: String = ""
    private var income: Double = 0.0

    override fun toString(): String {
        return "name: $name, income: $income"
    }
    open fun showInfo(){
        println(toString())
    }
}
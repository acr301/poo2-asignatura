package ej7

fun main() {
    val camion1 = Truck(5.0,80.0)
    val motocicleta1 = Motorcycle(20.0,10.0)

    println(camion1.move(390.0))
    println(camion1.move(20.0))

    println(motocicleta1.move(24.0))
}
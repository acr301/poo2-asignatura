package ej1

fun main() {
    val student1 = Student()
    student1.name = "Fulano"
    student1.carnet = 123456
    student1.mayor = "Ingeniería en Sistemas y Tecnologías de la Información"
    student1.year = 2012

    val student2 = Student()
    student2.name = "Sutano"
    student2.carnet = 654321
    student2.mayor = "Arqueología"
    student2.year = 2000

    val student3 = Student()
    student3.name = "Robert"
    student3.carnet = 987654
    student3.mayor = "Filosofía"
    student3.year = 2008


    student1.showInfo()
    student2.showInfo()
    student3.showInfo()

}
package ej10

fun main(){
    val book1 = Book()
    val book2 = Book()
    val book3 = Book()
    val book4 = Book()
    val book5 = Book()

    book1.initializeBook("The Purely Functional Software Deployment Model", "Eelco Dolstra", 1978)
    book2.initializeBook("Análisis y Diseño de Sistemas 8va Ed.", "Kendall & Kendall", 2011)
    book3.initializeBook("The Art of Computer Programming 3rd Ed", "Donald E. Knuth", 1997)
    book4.initializeBook("Foundations of Analog and Digital Electronic Circuits", "Anant Agarwal and Jeffrey H. Lang", 2005)
    book5.initializeBook("Mathematik fuer Ingenieure und Naturwissenschaftler Band 1 14. Auflage", "Lothar Papula", 2014)

    book1.showInfo()
    book2.showInfo()
    book3.showInfo()
    book4.showInfo()
    book5.showInfo()
}
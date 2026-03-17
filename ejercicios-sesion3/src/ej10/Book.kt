package ej10

class Book {
    var title: String = ""
    var author: String = ""
    var publishingYear: Int = 0

    fun initializeBook(title: String, author: String, publishingYear: Int){
        this.title = title
        this.author = author
        this.publishingYear = publishingYear
    }

    override fun toString(): String {
        return "Libro (titulo='$title', autor='$author', publicado en=$publishingYear)"
    }
    fun showInfo(){
        println(toString())
    }
}
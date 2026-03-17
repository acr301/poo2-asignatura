package ej6

class Taxi {
    var placa: String = ""
    var conductor: String = ""
    var modelo: String = ""

    fun initializeTaxi(placa: String, conductor: String, modelo: String){
        this.placa = placa
        this.conductor = conductor
        this.modelo = modelo
    }
}
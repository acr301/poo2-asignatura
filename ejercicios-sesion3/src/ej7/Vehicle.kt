package ej7

interface Vehicle {

    //todo: Asegurarse que kmsPerLiter y kms no sean negativos o 0
    val kmsPerLiter: Double
    var litersAmount: Double
    fun move(kms: Double): String {
        val reach = litersAmount * kmsPerLiter
        val totalFuelNeeded = kms / kmsPerLiter

        if(kms > reach) {
            val missingKms = kms - reach
            val missingFuel = missingKms / kmsPerLiter
            return ("no hay suficiente combustible, " +
                    "se quedó a $missingKms kilómetros de su destino, por $missingFuel litros corto :)")
        } else {
            litersAmount -= totalFuelNeeded
            return("el vehiculo se desplazo $kms kilometros, " +
                    "consumió $totalFuelNeeded litros, " +
                    "le quedan $litersAmount en el tanque")
        }
    }
}
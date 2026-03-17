package ej5


// accountNumber se declara como val en el constructor primario, es propiedad de la clase con
// getter público por defecto, initialBalance es un parámetro de construcción usado solo para
// inicializar la propiedad balance.
class BankAccount(val accountNumber: String, initialBalance: Double = 0.0) {
    private var balance: Double = initialBalance

    inner class ATM() {
        fun checkBalance(): Double = balance

        fun withdraw(amount: Double){
            if (amount <= balance) {
                balance -= amount
                println("retirado $amount, nuevo balance $balance")
            } else { println("fondos insuficientes") }
        }
        fun deposit(amount: Double){
            if (amount > 0) {
                balance += amount
                println("depositado: $amount, nuevo balance $balance")
            } else { println("monto invalido")}
        }
    }
}
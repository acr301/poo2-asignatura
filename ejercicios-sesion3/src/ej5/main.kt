package ej5

fun main(){
    val account = BankAccount("NIC505666420", 200.0)
    // se necesita una instancia de BankAccount (ATM es una inner class de BankAccount)
    val atm = account.ATM()
    atm.deposit(10.0)
    atm.checkBalance()
    atm.withdraw(220.0)
    atm.checkBalance()
    atm.withdraw(5.0)
    atm.checkBalance()
}
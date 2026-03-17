interface Calculadora{

    fun add(num1: Int, num2: Int): Int
    fun max(num1: Int, num2: Int): Int
    fun min(num1: Int, num2: Int): Int
}

// implementa la interfaz
class MiCalc: Calculadora{
    override fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun max(num1: Int, num2: Int): Int {
        if(num1 > num2) return num1
        return num2
    }

    override fun min(num1: Int, num2: Int): Int {
        if(num1 < num2) return num1
        return num2
    }
}

fun main(){
    val calc = MiCalc()
    println(calc.add(2,3))
    println(calc.max(6,3))
    println(calc.min(2,3))
}
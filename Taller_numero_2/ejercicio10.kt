package Taller_numero_2

fun Operadores(numero1:Double,numero2:Double,Operador:String):Pair<Double,String>{
    val Resultado = when(Operador){
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> numero1/numero2
        "%" -> numero1%numero2
        "**" -> Math.pow(numero1,numero2)
        else -> 0.0
    }
    val NOperador = when(Operador){
        "+" -> "SUMA"
        "-" -> "RESTA"
        "*" -> "MULTIPLICACION"
        "/" -> "DIVISION"
        "%" -> "MODULO"
        "**" -> "EXPONENCIAL"
        else -> "OPERADOR NO RECONOCIDO"
    }
    return Pair(Resultado,NOperador)
}

fun main(){

    print("digite el numero1: ")
    var numero1 = readLine()!!.toDouble()
    print("Digite el operador: ")
    var Operador = readLine()!!.toString()
    print("Digite el numero2: ")
    var numero2 = readLine()!!.toDouble()
    var firsts = Operadores(numero1, numero2, Operador).first
    var seconds = Operadores(numero1, numero2, Operador).second
    print("Resultado: ${firsts}, nombre operador: ${seconds}")
}
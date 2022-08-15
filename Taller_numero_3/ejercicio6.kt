package Taller_numero_3

fun main(){
    print("Digite el numero entero positivo multipicar: ")
    var numero = readLine()!!.toInt()

    println("Tabla de Multiplicar Del $numero")


    for(i in 1..10){
        println("$numero X $i = ${numero * i} ")
    }
}



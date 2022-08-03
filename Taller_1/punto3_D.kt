package Taller_1

/*
Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.
 */

fun ConversionDolares(PCO:Double):Double{

    val Dol = PCO/4370.85
    return Dol
}

fun main(){

    print("Valor en pesos colombianos: ")
    val POC = readln()!!.toDouble()
    println("La cantidad de dolares por el valor ingresado es de: " + ConversionDolares(POC))
}
package Taller_numero_2

import kotlin.math.PI

fun Area1(radio1:Double):Double{

     return PI*Math.pow(radio1,2.0)
}

fun Area2(radio1:Double,radio2:Double):Double{
    return Area1(radio1)-(PI*Math.pow(radio2,2.0))
}

fun main(){
    print("Digite el radio mas grande(m): ")
    var radio1 = readLine()!!.toDouble()
    print("Digite ahora el radio mas pequeño(m): ")
    var radio2 = readLine()!!.toDouble()
    println("El radio de la coronilla es de: "+ Area2(radio1,radio2)+"m^2")

}
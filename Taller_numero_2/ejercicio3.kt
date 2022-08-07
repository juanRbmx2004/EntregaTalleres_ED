package Taller_numero_2

import kotlin.math.sin

fun LogitudEscalera(altura:Double,angulo:Double):Double{
    print("resultado: "+sin(angulo))
    val Longitud = altura/sin(angulo)
    return Longitud
}

fun main(){
    print("digite la altura: ")
    val altura = readln()!!.toDouble()
    print("digite el angulo: ")
    val angulo = readln()!!.toDouble()
    println("La longitud de la escalera es de: "+ LogitudEscalera(altura, angulo))
}
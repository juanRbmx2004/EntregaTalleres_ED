package Taller_1

import kotlin.math.*

/*Escriba una función que halle el volumen de un cono */

fun VolumenCono(radio:Double,altura:Double):Double{

    var Volumen = PI*Math.pow(radio,2.0)*altura/3
    return Volumen
}

fun main(){

    print("digite el radio de la base del cono(m): ")
    val radio = readln()!!.toDouble()
    print("Digite la altura del cono(m): ")
    val altura = readln()!!.toDouble()
    print("El volumen del cono es de: "+ VolumenCono(radio, altura)+" m3")
}
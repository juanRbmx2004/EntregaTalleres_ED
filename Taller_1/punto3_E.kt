package Taller_1

/*
Una  empresa  que  contrata  personal  requiere  determinar  la  edad  de  las  personas  que  solicitan  trabajo,  pero
cuando  se  les  realiza  la  entrevista  sólo  se  les  pregunta  el  año  en  que  nacieron.  Realice  el  algoritmo  para
solucionar este problema.
 */

fun ConocerEdad(Nacimiento:Int):Int{

    val Edad = 2022-Nacimiento
    return Edad

}

fun main(){

    print("Año en el que nacio la persona: ")
    val Nacimiento = readln()!!.toInt()
    println("La Edad actual de la persona es de: "+ ConocerEdad(Nacimiento)+" años ")
}
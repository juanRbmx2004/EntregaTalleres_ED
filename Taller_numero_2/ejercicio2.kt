package Taller_numero_2

fun NumeroDeBuses(Gordos:Int,Flacos:Int,sillas:Int):Double{

    var numero_sillas_n = Gordos*2+Flacos
    var buses = Math.ceil((numero_sillas_n/sillas).toDouble())
    return buses
}

fun main(){

    print("Numero de sillas buses: ")
    val sillas = readln()!!.toInt()
    print("Numero de Estudiantes flacos: ")
    val Flacos = readln()!!.toInt()
    print("Numero de Estudiantes gordos: ")
    val Gordos = readln()!!.toInt()
    println("Numero de buses a alquilar: "+ NumeroDeBuses(Gordos,Flacos,sillas))
}
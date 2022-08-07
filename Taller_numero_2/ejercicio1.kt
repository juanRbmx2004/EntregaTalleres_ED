package Taller_numero_2

fun funcion(x:Double,y:Double)=x*2-2*x*y+y*2

fun main(){
    print("Cuanto vale x: ")
    val x = readln()!!.toDouble()
    print("Cuanto vale y: ")
    val y = readln()!!.toDouble()
    println("El resultado de la funcion es de: "+ funcion(x, y))
}
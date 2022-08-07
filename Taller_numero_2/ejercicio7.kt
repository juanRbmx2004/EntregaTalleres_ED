package Taller_numero_2

import kotlin.math.sqrt

fun Distancia(x1:Double,x2:Double,y1:Double,y2:Double):Double{

    return sqrt((Math.pow((y2-y1),2.0)) +(Math.pow((x2-x1),2.0)))
}

fun pendiente(x1:Double,x2:Double,y1:Double,y2:Double):Double{
    return y2-y1/x2-x1
}

fun PuntoMedio(x1:Double,x2:Double,y1:Double,y2:Double):String {
    var Mx= (x1+x2)/2
    var My = (y1+y2)/2
    return "("+Mx.toString()+","+My.toString()+")"
}

fun main(){
    print("Digite X1: ")
    var x1 = readLine()!!.toDouble()
    print("Digite Y1: ")
    var y1 = readLine()!!.toDouble()
    print("Digite X2: ")
    var x2 = readLine()!!.toDouble()
    print("Digite Y2: ")
    var y2 = readLine()!!.toDouble()
    println("La distancia entre las dos cordenadas es de: "+ Distancia(x1, x2, y1, y2))
    println("La pendiente de la recta que une es de: "+ pendiente(x1, x2, y1, y2))
    println("El punto medio de esa recta es de: "+ PuntoMedio(x1, x2, y1, y2))

}
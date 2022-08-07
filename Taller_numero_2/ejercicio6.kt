package Taller_numero_2

import kotlin.math.*

fun AreaRectangulo(B:Double,C:Double):Double{
    return B*C
}
fun Hipotenusa(A:Double,B: Double,C: Double):Double{
    return Math.pow((Math.pow(A-C,2.0))+(Math.pow(B,2.0)),0.5)
}
fun AreaTriangulo(A: Double,B: Double,C: Double):Double{
    return (A-C)*B/2
}
fun Perimetro(A: Double,B: Double,C: Double):Double{
    return A+B+C+ Hipotenusa(A, B, C)
}
fun main(){
    print("Dimencion del lado A: ")
    var A = readLine()!!.toDouble()
    print("Dimencion del lado B: ")
    var B = readLine()!!.toDouble()
    print("Dimencion del lado C: ")
    var C = readLine()!!.toDouble()
    print("El area del terreno es de: "+ (AreaRectangulo(B, C)+ AreaTriangulo(A, B, C))+" y el perimetro es de: "+ Perimetro(A, B, C))
}
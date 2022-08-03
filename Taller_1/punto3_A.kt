package Taller_1

/*ENTRADAS ---> Base-->B--->double
           ---> Altura--->A--->double

Salidas ----> Area Del Triangulo -->At--->double

*/
/*
Realice una función que halle el área de un triángulo.
 */

fun MedidasTriangulo(B:Double,A:Double):Double{

    var At = B*A/2

    return At
}
fun main(){

    print("ingrese la altura del triangulo: ")
    val A = readLine()!!.toDouble()
    print("ingrese la base del triagulo: ")
    val B = readLine()!!.toDouble()

    println("\nEl area del triangulo es de: "+ MedidasTriangulo(A,B))
}

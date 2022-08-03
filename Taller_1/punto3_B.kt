package Taller_1

// entradas numero estudiantes y valor de alquiler

//salidad: valor del alquiler total y numero de bicicletas

/*
Si  alquilar  una  bicicleta  tiene  cierto  valor  y  puede  transportar  dos  personas,  determine  cuántas  bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
universidad.
 */

fun Valor_bicicleta(ValorAlquiler:Double,NumeroEstudiante:Int):Pair<Int,Double>{
    val numero_bicicletas =NumeroEstudiante/2
    val el_valor_alquiler = numero_bicicletas*ValorAlquiler

    return Pair(numero_bicicletas,el_valor_alquiler)

}

fun main(){

    print("ingrese el valor del alquiler: ")
    val V = readLine()!!.toDouble()
    print("ingrese el numero de estudiantes: ")
    val Estudiantes = readLine()!!.toInt()
    var primera = Valor_bicicleta(V,Estudiantes).first
    val segunda = Valor_bicicleta(V,Estudiantes).second
    println("numero de bicicletas: ${primera}, el valor a pagar: ${segunda}")
}
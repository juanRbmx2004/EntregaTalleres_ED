package Taller_1

/*
Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una función
que permita determinar cuántas personas desempleadas hay actualmente en Colombia.
 */

fun dane(pc:Long):Long{

    val pd = pc*0.0815
    return pd.toLong()
}

// prograna

fun main(){

    print("Poblacion colombiana: ")
    val pc = readln()!!.toLong()
    println("la poblacion desempleada es: ${dane(pc)}")
}
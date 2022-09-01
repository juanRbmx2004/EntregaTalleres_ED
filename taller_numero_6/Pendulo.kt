package taller_numero_6

import kotlin.math.PI
import kotlin.math.sqrt

internal class Pendulo {
    private var L:Double=0.0
    private var A:Double=0.0
    constructor()
    constructor(L:Double,A:Double){
        this.L = L
        this.A = A
    }

    fun getlongitud()=this.L

    fun getAceleracion()=this.A

    fun setLongitud(nuevo:Double){
        if(nuevo!=0.0) {
            this.L = nuevo
        }
    }
    fun setAceleracion(nuevo: Double){
        if(nuevo!=0.0) {
            this.A=nuevo
        }
    }

    fun Formula():Double{
        return 2*PI*sqrt(this.A/this.L)
    }
}

data class Pendulo2(
    var L:Double=0.0,
    var A:Double=0.0
){
    fun Formula():Double{
        return 2*PI*sqrt(this.A/this.L)
    }
}

fun main(){
    var x = Pendulo2()
    var opcion:Int
    do{
        println("0.salir\n1.crear pendulo\n2.imprimir\n3.calcular osilacion pendulo")
        print("escoja una opcion: ")
        var opcion= readln().toInt()
        when(opcion){
            1->{
                print("longitud: ")
                var longitud = readln().toDouble()
                print("aceleracion: ")
                var aceleracion = readln().toDouble()
                x = Pendulo2(longitud,aceleracion)
            }
            2->{
                println("la longitud es de ${x.L} y la aceleracion: ${x.A}")
            }
            3->{
                println("el peridodo de aceleracion: ${x.Formula()}")
            }
        }
    }while(opcion!=0)
}
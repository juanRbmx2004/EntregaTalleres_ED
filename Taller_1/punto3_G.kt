package Taller_1


/*
Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.

 */
fun CobroPintura(Area:Double,Tarifa:Double):Double{

    var Total = Area * Tarifa
    return Total
}
fun main(){
    print("Area Total Pintada(m2): ")
    val Area = readln()!!.toDouble()
    print("Tarifa de cobro por metro cuadrada: ")
    val Tarifa = readln()!!.toDouble()
    println("El cobro total del trabajo es de: $"+ CobroPintura(Area,Tarifa))
}
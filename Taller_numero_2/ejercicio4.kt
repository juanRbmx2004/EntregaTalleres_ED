package Taller_numero_2

fun SueldoYGastos(sueldo:Double){
    val GastoComida = sueldo*0.15
    val GastosArriendo = sueldo*0.4
    val Dinero = sueldo-GastoComida-GastosArriendo
    println("Gastos en arriendo: "+GastosArriendo)
    println("Gastos en comida: "+GastoComida)
    println("Dinero a disposicion: "+Dinero)
}
fun main(){
    print("sueldo de la persona: ")
    var sueldo = readLine()!!.toDouble()
    SueldoYGastos(sueldo)
}
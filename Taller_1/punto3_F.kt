package Taller_1

/*Un  estacionamiento  requiere  determinar  el  cobro  que  debe  aplicar  a  las  personas  que  lo  utilizan.  Considere
que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas y
realice una función que permita determinar el cobro.
 */

fun CobroParqueadero(Horas:Int,Tarifa:Double):Double{

    var Total = Horas*Tarifa
    return Total
}

fun main(){

    print("Tarifa de parqueader por hora: ")
    val Tarifa = readln()!!.toDouble()
    print("Horas de parqueadero: ")
    val Horas = readln()!!.toInt()
    println("El total a pagar del parqueadero es de: $"+ CobroParqueadero(Horas,Tarifa))
}

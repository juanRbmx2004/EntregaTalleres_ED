package Taller_numero_2

fun AumentoSueldo(Sueldo:Double):Pair<Double,Double>{
    if(Sueldo<=800000){
        return Pair(Sueldo*0.1,Sueldo*0.1+Sueldo)
    }
    else if(Sueldo>800000&&Sueldo<=1200000){
        return Pair(Sueldo*0.08,Sueldo*0.08+Sueldo)
    }
    else{
        return Pair(Sueldo*0.05,Sueldo*0.05+Sueldo)
    }
}
fun main(){
    print("digita el sueldo actual del empleado: ")
    val Sueldo = readLine()!!.toDouble()
    var firts = AumentoSueldo(Sueldo).first
    var Seconds = AumentoSueldo(Sueldo).second
    println("El aumento fue de: ${firts}, en total es de: ${Seconds}")
}
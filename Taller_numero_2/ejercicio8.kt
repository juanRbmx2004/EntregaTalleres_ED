package Taller_numero_2

fun Salones(Estudiantes:Int,CSalon:Int,CPiso:Int):Pair<Int,Int>{
    val TotalSalones = Math.ceil((Estudiantes.toDouble()/CSalon.toDouble()))
    val TotalPisos = Math.ceil((TotalSalones/CPiso))
    return Pair(TotalSalones.toInt(),TotalPisos.toInt())
}

fun main(){
    print("Digite el total de estudiantes: ")
    var Estudiantes = readLine()!!.toInt()
    print("Digite la capacidad de cada salon: ")
    var CSalon = readLine()!!.toInt()
    print("Digite los salones por piso: ")
    var CPiso = readLine()!!.toInt()
    var Total_salon = Salones(Estudiantes, CSalon, CPiso).first
    var Total_pisos = Salones(Estudiantes, CSalon, CPiso).second

    println("El numero de salones es de: ${Total_salon}, y el numero de pisos es de: ${Total_pisos}")
}
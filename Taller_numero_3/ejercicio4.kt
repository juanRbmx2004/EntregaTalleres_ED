package Taller_numero_3

fun HorasExtras(Horas:Int):Double{
    if(Horas<=35){
        return Horas.toDouble()*15_000
    }
    else if (Horas>35&&Horas<=60){
        return ((Horas.toDouble()-35)*18000)+(35*15000)
    }
    else{
        var A = (Horas-60)*25_000
        var B = 35*15_000
        var C = 25*18_000
        return A.toDouble()+B+C
    }

}

fun main(){
    print("Cant Empleados: ")
    var Empleados = readLine()!!.toInt()
    var Condicion = 0
    while(Condicion != Empleados){
        print("Cantidad de horas trabajadas Empleado #${Condicion+1}: ")
        var Horas = readLine()!!.toInt()
        println("El salario del empleado #${Condicion+1} es de: "+ HorasExtras(Horas))
        Condicion++
    }

}
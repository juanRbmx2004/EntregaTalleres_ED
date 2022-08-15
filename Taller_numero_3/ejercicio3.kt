package Taller_numero_3

import java.awt.PageAttributes.PrintQualityType


fun Comisiones(Ventas:Double):Double{
    if (Ventas>50_000){
        var Comision = Ventas*0.15
        return Comision
    }
    else{
        return 0.0
    }
}


fun main(){


    do{
        print("Salario del empleado: ")
        var Salario = readLine()!!.toDouble()
        print("Ventas totales del empleado: ")
        var Ventas = readLine()!!.toDouble()
        println("La comision es de: ${Comisiones(Ventas)}; y el sueldo neto de: ${(Comisiones(Ventas))+Salario}")

        print("\nsi desea salir digite 0, para seguir digite cualquier otro numero: ")
        var Condicion = readLine()!!.toInt()
        if(Condicion==0){
            break
        }


    }while(true)
}


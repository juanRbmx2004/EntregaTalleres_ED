package Taller_numero_3

fun Comision(ventas:Double):Double{
    var c=0.0
    if(ventas<50000){
        c = ventas*0.07
    }
    else if(ventas>=50000&&ventas<100_000){
        c =ventas*0.09+5000
    }
    else if(ventas>=100_000&&ventas<200_000){
        c = ventas*0.11+10000
    }
    else if(ventas in 200_000.0 .. 499_999.0){
        c = ventas*0.13+20_000
    }

    else{
        c=ventas*0.15+40_000
    }

    return c

}

fun main(){
    print("Ventas del empleado: ")
    var ventas = readLine()!!.toDouble()
    while(ventas>0) {
        print("La comision del vendedor es de: " + Comision(ventas))
        print("\nVentas del empleado: ")
        ventas = readLine()!!.toDouble()
    }
}

fun comision2(ventas:Double):Double{
    when(ventas){
        in 0.0..49_999.0->ventas*0.07
        in 50_000.0 ..99_999.0->ventas*0.09+10000
        else->ventas*0.15+40_000
    }
    return ventas
}

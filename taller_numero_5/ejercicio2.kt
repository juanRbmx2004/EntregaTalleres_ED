package taller_numero_5

fun MenorAltura(ListAltura:MutableList<Double>,num:Float):Int{
    var contador = 0
    for(i in ListAltura){
        if(i<num){
            contador+=1
        }
    }
    return contador
}

fun Promedio(ListAltura:MutableList<Double>):Float{
    var promedio = 0.0.toFloat()
    for (i in ListAltura){
        promedio += i.toFloat()
    }
    promedio = promedio/(ListAltura.size).toFloat()
    return promedio
}


fun main(){

    var ListAltura:MutableList<Double> = mutableListOf()

    do {
        print("Digite la Altura(m): ")
        var altura = readLine()!!.toDouble()
        if (altura<3.0&&altura>0.0) {
            ListAltura.add(altura)
        }
        else{
            break
        }

    }while(true)

    println("El promedio de alturas es de: ${Promedio(ListAltura)} ")
    println("Las personas por debajo del promedio es de: ${MenorAltura(ListAltura,Promedio(ListAltura))}")

}


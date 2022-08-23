package taller_numero_5

import kotlin.math.sqrt

fun distancia(x:Double,y:Double):Double{
    return sqrt(Math.pow(x,2.0)*Math.pow(y,2.0))
}

fun Cuadrante(x:Double,y:Double):Int{
    if(x>0&&y>0){
        return 1
    }
    else if(x<0&&y>0){
        return 2
    }
    else if(x<0&&y<0){
        return 3
    }
    else if(x>0&&y<0){
        return 4
    }
    else{
        return 0
    }
}

fun MayorDistancia(listaCoor:MutableList<Pair<Double,Double>>):Triple<Pair<Double,Double>,Double,Int> {
    var listaDistancia: MutableList<Double> = mutableListOf()
    for ((x, y) in listaCoor) {
        var ditancia = distancia(x, y)
        listaDistancia.add(ditancia)

    }
    var distancia = listaDistancia.max()
    var indice = listaDistancia.indexOf(distancia)
    var (x_i,y_i) = listaCoor.get(indice)
    var cuadrante = Cuadrante(x_i, y_i)

    return Triple(Pair(x_i,y_i),distancia,cuadrante)
}

fun main(){
    var listaCoor:MutableList<Pair<Double,Double>> = mutableListOf()
    var x = 0.0
    var y = 0.0

    print("Cuantos puntos va a preguntar: ")
    var puntos = readLine()!!.toInt()
    repeat(puntos){
        print("Digite las cordenadas en X y Y separadas por espacio (ej: X Y): ")
        var punto = readLine()!!.toString()
        x = punto.split(" ")[0].toDouble()
        y = punto.split(" ")[1].toDouble()
        listaCoor.add(Pair(x,y))
    }
    var(punto,distancia,cuadrante) = MayorDistancia(listaCoor)
    println("\nEl punto mas alejado del origen es: $punto")
    println("La distancia es de: $distancia")
    println("El punto se encuentra en el cuadrante: $cuadrante")
}




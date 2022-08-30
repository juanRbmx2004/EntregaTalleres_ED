package taller_numero_4

fun main(){
    var listaPuntajes:MutableList<Double> = mutableListOf()
    var listaNombres:MutableList<String> = mutableListOf()
    print("Cuantos estudiantes hay: ")
    var CantEstudiantes = readln().toInt()
    repeat(CantEstudiantes){
        print("\nNombre del estudiante #${it+1}: ")
        var nombre = readln()
        print("Puntaje final del estudiante $nombre: ")
        var puntaje = readln().toDouble()
        listaPuntajes.add(puntaje)
        listaNombres.add(nombre)
    }

    var mayor = listaPuntajes.maxOrNull()
    var menor = listaPuntajes.min()
    var indiceMayor = listaPuntajes.indexOf(mayor)
    var indiceMenor = listaPuntajes.indexOf(menor)
    var NombreMayor = listaNombres.get(indiceMayor)
    var NombreMenor = listaNombres.get(indiceMenor)
    var suma = 0.0
    var Contador_i60 = 0
    var Contador_s60=0
    for(i in listaPuntajes) {
        suma += i
        if(i<60){
            Contador_i60 +=1
        }
        else{
            Contador_s60 +=1
        }
    }
    var promedio = suma/listaPuntajes.size
    var inferior_60 = Contador_i60*100/listaPuntajes.size
    var superior_60 = Contador_s60*100/listaPuntajes.size

    println("\nEstudiante con mayor puntaje es: $NombreMayor")
    println("Estudiante con menor puntaje es: $NombreMenor")
    println("Puntaje mas alto: $mayor")
    println("Puntaje mas bajo: $menor")
    println("Promedio puntaje: $promedio")
    println("Porcentaje estudiantes inferior a 60: $inferior_60%")
    println("Porcentaje estudiantes superior a 60: $superior_60%")
}
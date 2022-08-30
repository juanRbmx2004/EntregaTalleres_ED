package taller_numero_4

fun NotasFinal(listaNotas:MutableList<Triple<Double,Double,Double>>):Pair<MutableList<Double>,Double>{
    var TotalNota:MutableList<Double> = mutableListOf()
    var promedio = 0.0
    var nota = 0.0
    for((parcial1,parcial2,Examen) in listaNotas){
        nota = parcial1*0.25+parcial2*0.25+Examen*0.5
        promedio += nota
        TotalNota.add(nota)

    }
    promedio = promedio/TotalNota.size
    return Pair(TotalNota,promedio)
}

fun Estudiantes_pasaron_oerdieron(listaNotas:MutableList<Triple<Double,Double,Double>>):Pair<Int,Int>{
    var perdieron = 0
    var pasaron = 0
    for((parcial1,parcial2,Examen) in listaNotas){
        var nota = parcial1*0.25+parcial2*0.25+Examen*0.5
        if(nota>=60){
            pasaron +=1
        }
        else {
            perdieron += 1
        }
    }
    return Pair(pasaron,perdieron)
}

fun NotaIgual(listaNotas:MutableList<Triple<Double,Double,Double>>):Pair<Int,Int>{
    var igualDiez = 0
    var igualCien = 0
    for((parcial1,parcial2,Examen) in listaNotas){
        var nota = parcial1*0.25+parcial2*0.25+Examen*0.5
        if(nota==10.0){
            igualDiez +=1
        }
        else if(nota == 100.0){
            igualCien += 1
        }
    }
    return Pair(igualDiez,igualCien)
}


fun main(){
    var listaNotas:MutableList<Triple<Double,Double,Double>> = mutableListOf()
    print("Cuantos estudiantes desea registrar: ")
    var estudiantes = readln().toInt()
    repeat(estudiantes){
        println("\nESTUDIANTE #${it+1}")
        print("Digite Nota parcial #1: ")
        var parcial1 = readln().toDouble()
        print("Digite Nota parcial #2: ")
        var parcial2 = readln().toDouble()
        print("Digite Nota Examen: ")
        var Examen = readln().toDouble()

        listaNotas.add(Triple(parcial1,parcial2,Examen))
    }

    var(listaDeNotas,Promedio) = NotasFinal(listaNotas)
    var (pasaron,perdieron)= Estudiantes_pasaron_oerdieron(listaNotas)
    var (igualDiez,igualCien) = NotaIgual(listaNotas)
    println("\nlista de notas de todos los estudiantes: $listaDeNotas")
    println("Estudiantes que pasaron: $pasaron, estudiantes que perdieron: $perdieron")
    println("estudiantes con nota 10.0: $igualDiez, y con nota 100.0: $igualCien")
    println("El promedio del curso es de: $Promedio")
}


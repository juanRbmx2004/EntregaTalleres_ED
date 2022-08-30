package taller_numero_4

fun Puntos(ganados:Int,empatados:Int):Int{
    return 3*ganados+empatados
}

fun  main(){
    print("cuantos equipos hay en la liga: ")
    var NumEquipos = readln().toInt()
    var listaPuntos:MutableList<Int> = mutableListOf()
    var listaEquipos:MutableList<String> = mutableListOf()
    repeat(NumEquipos){
        print("\nnombre equipo: ")
        var Nombre = readln()
        print("Partidos ganados equipo $Nombre: ")
        var ganados = readln().toInt()
        print("Partidos empatados equipo $Nombre: ")
        var empatados = readln().toInt()
        var puntos = Puntos(ganados,empatados)
        print("Numero de puntos equipo $Nombre: $puntos")
        listaEquipos.add(Nombre)
        listaPuntos.add(puntos)
    }
    var mayor = listaPuntos.maxOrNull()
    var indice = listaPuntos.indexOf(mayor)
    var EquipoGanadro = listaEquipos.get(indice)
    println("\nEl equipo ganador es: $EquipoGanadro")


}
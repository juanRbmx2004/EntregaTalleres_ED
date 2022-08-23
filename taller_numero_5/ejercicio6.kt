package taller_numero_5

fun EstudianteViejo(listaEstu:MutableList<Pair<String,Int>>):String{
    var listaEdad:MutableList<Int> = mutableListOf()
    var listaNom:MutableList<String> = mutableListOf()
    for(i in listaEstu){
        var Edad = i.second
        var Nom = i.first
        listaEdad.add(Edad)
        listaNom.add(Nom)
    }
    var Viejo = listaEdad.minOrNull()
    var indice = listaEdad.indexOf(Viejo)
    return listaNom.elementAt(indice)
}

fun main(){
    var listaEstu:MutableList<Pair<String,Int>> = mutableListOf()
    print("Cuantos estudiantes son: ")
    var estudiantes = readLine()!!.toInt()
    repeat(estudiantes){
        print("Digite el nombre #${it+1}: ")
        var nom = readLine()!!.toString()
        print("Digite la fecha de nacimiento #${it+1}: ")
        var nac = readLine()!!.toInt()
        listaEstu.add(Pair(nom,nac))
    }
    println("\nEl estudiante mas VIEJO es: ${EstudianteViejo(listaEstu)}")
}
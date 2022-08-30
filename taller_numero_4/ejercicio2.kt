package taller_numero_4

fun main (){
    var listaEstatura:MutableList<Double> = mutableListOf()
    print("Digite la cantidad de estaturas a preguntar: ")
    var NumEstaturas = readln().toInt()
    repeat(NumEstaturas){
        print("Estatura #${it+1} en cm: ")
        var estatura = readln().toDouble()
        listaEstatura.add(estatura)
    }
    var EstaturaMayor = listaEstatura.maxOrNull()
    print("la mayor estatura es de: $EstaturaMayor cm")
}
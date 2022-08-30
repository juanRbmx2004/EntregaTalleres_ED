package taller_numero_4

fun IMC(peso:Double,altura:Double):Double{
    return peso*altura*2
}
fun main(){
    var listaGordo:MutableList<Triple<String,Double,Double>> = mutableListOf()
    var listaIMC:MutableList<Double> = mutableListOf()
    print("Cuantas personas hay en la empres: ")
    var CantPersonas = readln().toInt()
    repeat(CantPersonas){
        print("\nNombre persona #1: ")
        var nombre = readln()
        print("Peso persona $nombre: ")
        var peso = readln().toDouble()
        print("Altura persona $nombre: ")
        var altura = readln().toDouble()
        var IMCpersona = IMC(peso,altura)
        print("El IMC de $nombre es: $IMCpersona")
        listaGordo.add(Triple(nombre,peso,altura))
        listaIMC.add(IMCpersona)
        print("\n")
    }
    var mayorIMC = listaIMC.maxOrNull()
    var indice = listaIMC.indexOf(mayorIMC)
    var (nombreP,pesoP,alturaP) = listaGordo.get(indice)

    print("Nombre de persona con mayor IMC: $nombreP")
    print("\npeso de persona con mayor IMC: $pesoP")
    print("\naltura de persona con mayor IMC: $alturaP")


}
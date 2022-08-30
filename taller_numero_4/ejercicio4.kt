package taller_numero_4

fun distancia(coordenandas:MutableList<Triple<String,Double,Double>>):Pair<String,Double>{
    var lista_distancias:MutableList<Double> = mutableListOf()
    var mayor = 0.0
    for((Nombre,latitud,longitud) in coordenandas){
        var distancia = latitud*2.0+longitud*2.0
        lista_distancias.add(distancia)
    }
    mayor = lista_distancias.max()
    var indice = lista_distancias.indexOf(mayor)
    var Nombre = coordenandas.get(indice).first
    return Pair(Nombre,mayor)

}

fun main(){
    var coordenandas:MutableList<Triple<String,Double,Double>> = mutableListOf()
    print("Digite cuantas ciudades va a comparar sus distancias respecto a bogota: ")
    var CantCiudades = readln().toInt()
    repeat(CantCiudades){
        print("\nDigite el nombre de la ciudad #${it+1}: ")
        var nombre = readln().toString()
        print("Digite la latitud de la ciudad #${it+1}: ")
        var latitud = readln().toDouble()
        print("Digite la longitud de la ciudad #${it + 1}: ")
        var longitud = readln().toDouble()
        coordenandas.add(Triple(nombre,latitud,longitud))
    }
    println("\nLa ciudad mas alejada de bogota es: ${distancia(coordenandas).first}, con una distancia de: ${distancia(coordenandas).second}")
}


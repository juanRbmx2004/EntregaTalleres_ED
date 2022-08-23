package taller_numero_5

fun areaTriangulo(base:Double,altura:Double):Double{
    return base*altura/2.0
}

fun mayorTriangulo(listaTringulos:MutableList<Triple<String,Double,Double>>):String{
    var listaAreas:MutableList<Double> = mutableListOf()
    var listaNombre:MutableList<String> = mutableListOf()
    for((nombre,base,altura) in listaTringulos){
        var area = areaTriangulo(base,altura)
        listaAreas.add(area)
        listaNombre.add(nombre)
    }

    var areas =  listaAreas.maxOrNull()
    var indice = listaAreas.indexOf(areas)
    return listaNombre.get(indice)
}

fun NombreArea(listaTringulos:MutableList<Triple<String,Double,Double>>,nombre:String):Double{
    for((nombreA,base,altura) in listaTringulos){
        if (nombre == nombreA){
            return areaTriangulo(base,altura)
        }
    }
    return -1.0
}

fun main(){
    var nom = ""
    var base = 0.0
    var altura = 0.0
        print("Digite cuantos triangulos a guardar: ")
        var cant = readLine()!!.toInt()
        var listaTringulos:MutableList<Triple<String,Double,Double>> = mutableListOf()
        repeat(cant) {
            print("digite el nombre, base y altura del triangulo #${it+1} separados por un espacio(ej: nom base altu): ")
            var triangulo = readLine()!!.toString()
            nom = triangulo.split(" ")[0].toString()
            base = triangulo.split(" ")[1].toDouble()
            altura = triangulo.split(" ")[2].toDouble()
            listaTringulos.add(Triple(nom,base,altura))
        }
    print("Digite el triangulo a buscar el area: ")
    var buscar = readLine()!!.toString()
    println("El area del tiagulo $buscar es de: ${NombreArea(listaTringulos,buscar)}")
    println("El area mas grande es de: ${mayorTriangulo(listaTringulos)}")

}
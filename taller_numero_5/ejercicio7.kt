package taller_numero_5
fun precio_carro(lista:MutableList<Pair<String,Double>>,placa:String):Double{
    var p = -1.0
    for((placas,precio) in lista){
        if(placas==placa){
            p = precio
        }

    }
    return p
}

fun main(){
    var lista:MutableList<Pair<String,Double>> = mutableListOf()
    var placa:String
    var precio:Double
    do {
        print("Digite una placa: ")
        placa = readLine()!!.toString()
        if(placa==""){
            break
        }
        print("Digite el precio del vehiculo: ")
        precio = readLine()!!.toDouble()
        if(precio<=0.0){
            break
        }
        lista.add(Pair(placa, precio))
    }while(true)

    print("Digite la placa a buscar: ")
    var plac = readLine()!!.toString()
    print("El valor de la placa $plac es de: ${precio_carro(lista, plac)} ")

}

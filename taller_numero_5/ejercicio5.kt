package taller_numero_5

fun BuscarCiudad(listaC:MutableList<String>,ciudad:String):Boolean{
    for(i in listaC){
        if(i==ciudad.lowercase()){
            return true
        }
    }
    return false
}

fun main(){
    var listaC:MutableList<String> = mutableListOf()
    var contador = 1
    do{
        print("Digite nombre de la ciudad #$contador a agregra: ")
        var ciudadA = readLine()!!.toString().lowercase()
        if(ciudadA.isEmpty()){
            break
        }
        listaC.add(ciudadA)
    }while(true)

    print("Digite la ciudad a buscar: ")
    var ciudad = readLine()!!.toString()

    if(BuscarCiudad(listaC,ciudad)){
        println("la ciudad $ciudad fue encontrada")
    }
    else{
        println("la ciudad $ciudad no fue encontrada")
    }
}
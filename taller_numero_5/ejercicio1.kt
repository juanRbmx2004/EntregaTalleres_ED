package taller_numero_5

fun siglos_pasado(edades:MutableList<Int>):Pair<Int,Float>{

    var sigloPasado=0
    var suma=0.0
    for(i in edades){
        if(i>=23){
            sigloPasado+=1
        }
        suma+=i
    }
    var promedio = suma/edades.size

    return Pair(sigloPasado,promedio.toFloat())
}

fun main(){
    var edades:MutableList<Int> = mutableListOf()
    var index = 0
    do{

        print("Digite una edad: ")
        var edad = readLine()!!.toInt()

        edades.add(index,edad)
        index +=1
        print("seguir digite 0: ")
        var condicion = readLine()!!.toInt()
        if(condicion != 0){
            break
        }


    }while(true)

    var(primera,segunda)= siglos_pasado(edades)
    print("\nCantidad del siglo pasado $primera, promedio $segunda")
}
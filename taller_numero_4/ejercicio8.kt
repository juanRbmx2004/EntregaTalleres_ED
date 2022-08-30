package taller_numero_4

fun main(){
    var listaNumeros:MutableList<Int> = mutableListOf()
    var contador = 1
    do{
        print("digite el numero #${contador}: ")
        var numero = readLine()!!.toInt()
        if(numero <=0){
            break
        }
        listaNumeros.add(numero)
        contador++
    }while(true)
    var mayor = listaNumeros.maxOrNull()
    var menor = listaNumeros.min()
    var impares = 0
    var pares = 0
    var suma = 0
    for( i in listaNumeros){
        suma+=i
        if(i%2 == 0){
            pares+=1
        }
        else{
            impares+=1
        }
    }
    var promedio = suma.toDouble()/listaNumeros.size
    println("El mayor numero es: $mayor")
    println("El menor numero es: $menor")
    println("cantidad de impares es: $impares")
    println("cantidad de pares es: $pares")
    println("el promedio de los numeros es: $promedio")
}
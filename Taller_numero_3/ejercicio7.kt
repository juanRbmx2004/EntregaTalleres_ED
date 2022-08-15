package Taller_numero_3

fun divisores(num:Int):Int{
    var cantDiv=0
    for(i in 1.. num){
        if(num%i==0){
            cantDiv +=1
        }

    }
    return cantDiv
}

fun main(){

    print("digite el numero: ")
    var num = readLine()!!.toInt()
    println("La cantidad de divisores del numero $num es de: ${divisores(num)}")
}
package Taller_numero_2

fun NumeroMayr(numero1:Int,numero2:Int):Int{
    if(numero1>numero2){
        return numero1
    }
    else if(numero2>numero1){
        return numero2
    }
    else{
        print("Numeros Iguales\n")
        return 0
    }
}
fun main(){
    print("Digite el numero 1: ")
    val numero1 = readLine()!!.toInt()
    print("Digite el numero 2: ")
    val numero2 = readLine()!!.toInt()
    println("El numero mayor es: "+ NumeroMayr(numero1, numero2))
}

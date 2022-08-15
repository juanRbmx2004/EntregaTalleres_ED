package Taller_numero_3

fun Factorial(num:Int):Int{
    var factor=1
    for (i in num downTo  1){
        factor *= i
    }
    return factor
}

fun main(){
    print("Digite un numero entero pisitivo: ")
    var num = readLine()!!.toInt()
    for(i in 1..num){
        println("Factor del numero #$i es $i! = ${Factorial(i)}")
    }
}
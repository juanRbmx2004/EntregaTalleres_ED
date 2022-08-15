package Taller_numero_3

fun SumaDivisores(num:Int):Int{
    var suma=0
    for(i in 1 until  num){
        if(num%i==0) {
            suma += i
        }
    }
    return suma
}
fun main(){
    print("Digite un numero entero positivo: ")
    var num = readLine()!!.toInt()
    print("La suma de sus divisores del numero $num es: ${SumaDivisores(num)}")
}
package Taller_numero_3

fun main(){
    var n= readln()!!.toInt()
    var suma = 0
    print("0")
    for(i in 1..n){
        print("+${i}")
         suma = suma + i

    }
    println("\n"+suma)
}
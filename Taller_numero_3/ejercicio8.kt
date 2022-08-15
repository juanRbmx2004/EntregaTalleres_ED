package Taller_numero_3

fun Primos(num:Int):Boolean{
    return divisores(num)==2
}
fun main(){
    print("Digite un numero entero: ")
    var num = readLine()!!.toInt()
    for (i in 2..num){
        if(Primos(i)){
            print("\nnumero primo: "+i)
        }

    }
}
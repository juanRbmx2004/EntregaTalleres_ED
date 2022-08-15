package Taller_numero_3


fun NumerosPerfectos(num:Int):Boolean{
    return num == SumaDivisores(num)
}


fun main(){
    print("Digite un numero entero positivo: ")
    var num = readLine()!!.toInt()
    var contador = 0
    for (i in 1.. num){
        if(NumerosPerfectos(i)){
            contador++
            println("Numero perfecto #$contador: $i")
        }
    }
    println("La cantidad de numeros perfectos son de: $contador")
}
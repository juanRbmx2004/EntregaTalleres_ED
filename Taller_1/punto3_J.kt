package Taller_1

/*
Realice  una  función  para  determinar  la  nota  final  que  obtendrá  un  alumno  considerando  que  realiza  tres
exámenes,  de los  cuales el  primero y  el  segundo tienen una  ponderación de 25%, mientras que  el  tercero de
50%.
 */

fun NotaTotalAlumo(Nota1:Double,Nota2:Double,Nota3:Double):Double{

    var NotaFinal = (Nota1*0.25)+(Nota2*.25)+(Nota3*.50)
    return NotaFinal
}

fun main(){

    print("Digite la nota #1: ")
    val Nota1 = readln()!!.toDouble()
    print("Digite la nota #2: ")
    val Nota2 = readln()!!.toDouble()
    print("Digite la nota #3: ")
    val Nota3 = readln()!!.toDouble()

    println("La nota final del alumno es de: "+ NotaTotalAlumo(Nota1,Nota2,Nota3))

}
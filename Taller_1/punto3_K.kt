package Taller_1

/*Se  tiene  el  nombre  y  la  edad  de  tres  personas.  Se  desea  saber  el  nombre  y  la  edad  de  la  persona  de  menor
edad.

 */

fun MenorEdad(Edad1:Int,Edad2: Int,Edad3: Int,Nombre1:String,Nombre2: String,Nombre3: String):Pair<Int,String>{

    if(Edad1<Edad2&&Edad1<Edad3){
        return Pair(Edad1,Nombre1)
    }
    if(Edad2<Edad1&&Edad2<Edad3){
        return Pair(Edad2,Nombre2)
    }
    else{
        return Pair(Edad3,Nombre3)
    }
}

fun main(){
    print("digite la edad #1: ")
    val Edad1 = readln()!!.toInt()
    print("digite el nombre #1: ")
    val Nombre1 = readln()!!.toString()
    print("digite la edad #2: ")
    val Edad2 = readln()!!.toInt()
    print("digite el nombre #2: ")
    val Nombre2 = readln()!!.toString()
    print("digite la edad #3: ")
    val Edad3 = readln()!!.toInt()
    print("digite el nombre #3: ")
    val Nombre3 = readln()!!.toString()
    var primera = MenorEdad(Edad1, Edad2, Edad3, Nombre1, Nombre2, Nombre3).first
    val segunda = MenorEdad(Edad1, Edad2, Edad3, Nombre1, Nombre2, Nombre3).second

    println("La persona llamada ${segunda} es el menor con ${primera} años de edad")

}
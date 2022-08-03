package Taller_1

/*Se  requiere  determinar  el  tiempo  que  tarda  una  persona  en  llegar  de  una  ciudad  a  otra  en  bicicleta,
considerando que lleva una velocidad constante. Realice una función para tal fin.
 */

fun TiempoRecorrido(Velocidad:Double,Distacia:Double):Double{
    var Tiempo = Distacia/Velocidad
    return Tiempo
}

fun main(){
    print("Digite la velocidad en (Km/H): ")
    val Velocidad = readln()!!.toDouble()
    print("Digite la distancia en (Km): ")
    val Distacia = readln()!!.toDouble()
    println("El tiempo estimado es de: "+ TiempoRecorrido(Velocidad,Distacia)+" horas")
}
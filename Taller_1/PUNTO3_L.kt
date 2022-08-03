package Taller_1

/*El  presidente  de  la  república  ha  decidido  estimular  a  todos  los  estudiantes  de  una  universidad  mediante  la
asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos
mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual
a 75, de$1000.00; para los promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se
les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos
de 18 años o menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000; con promedios
menores  a  90  pero  mayores  o  iguales  a  80,  $2000;  para  los  alumnos  con  promedios  menores  a  80  pero
mayores o iguales a  60, se  les dará $100, y  a los  alumnos que tengan  promedios  menores a  6 se les enviará
carta de invitación. Realice la función correspondiente. */

fun DefinirBeca(Edad:Int,Promedio:Double):String{

    if(Edad>18){
        if(Promedio>=90){
            return "Tu beca ha sido de un valor de $2000.00"
        }
        else if(Promedio>=75){
            return "Tu beca ha sido de un valor de $1000.00"
        }
        else if(Promedio>=60){
            return "Tu beca ha sido de un valor de $500.00"
        }
        else{
            return "No alcanzaste el promedio minimo para obtener una beca, sige intentandolo. ¡No pierdas la oportunidad!"
        }
    }
    else{
        if(Promedio>=90){
            return "Tu beca ha sido de un valor de $3000.00"
        }
        else if(Promedio>=80){
            return "Tu beca ha sido de un valor de $2000.00"
        }
        else if(Promedio>=60){
            return "Tu beca ha sido de un valor de $100.00"
        }
        else{
            return "No alcanzaste el promedio minimo para obtener una beca, sige intentandolo. ¡No pierdas la oportunidad!"
        }
    }
}

fun main(){

    print("Cual es tu edad: ")
    val Edad = readln()!!.toInt()
    print("Cual es tu promedio: ")
    val Promedio = readln()!!.toDouble()
    println(DefinirBeca(Edad, Promedio))
}
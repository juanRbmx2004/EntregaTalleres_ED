fun main(){

    print("digite un dia de la semana: ")
    var dia = readln()!!.toString().lowercase()
    println("El dia sigiente es: "+dia(dia))

}

fun dia(D:String)= when(D){
        "lunes"->"martes"
        "martes"->"miercoles"
        "miercoles"->"jueves"
        "jueves"->"sabado"
        "sabado"->"domingo"
        "domingo"->"lunes"
        else->"Mal digitado"
        }


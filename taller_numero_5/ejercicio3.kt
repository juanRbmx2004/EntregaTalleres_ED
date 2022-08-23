package taller_numero_5

fun Verbos(palabras:MutableList<String>):Int{
    var contador = 0
    for(i in palabras){

        var  minuscula = i.lowercase()
        var mayuscula = i.uppercase()
        if(minuscula.endsWith("ar")||minuscula.endsWith("er")||minuscula.endsWith("ir")){
            contador +=1
        }

    }
    return contador
}

fun main(){
    var num:Int
    var ListaPalabras:MutableList<String> = mutableListOf()
    print("Cuantas palabras a ingresar: ")
    num = readLine()!!.toInt()

    repeat(num){
        print("Digite la palabra#${it+1}: ")
        var palabra = readLine()!!.toString()
        ListaPalabras.add(it,palabra)
    }
    var verbos1 = Verbos(ListaPalabras)
    println("Cantidad de verbos es: ${verbos1}")

}
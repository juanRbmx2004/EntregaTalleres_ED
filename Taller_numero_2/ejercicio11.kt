package Taller_numero_2


/*
11. Vamos a hacer un programa que transforme un número entero a
números romanos. Por ahora solo vamos a considerar números entre 1 y
99. Para ello desarrolle las siguientes funciones y el programa:

1. Escriba una función que descomponga un número entero de
dos cifras en sus dos dígitos, es decir, la función retorna las
decenas y las unidades del número original.

Escriba otra función que reciba un número entero de un dígito
(es decir, entre 0 y 9) y retorne el equivalente en romano de
ese digito. O sea, para 1 retorne "I", para 2 debe retornar "II" y
así sucesivamente. Para el cero retorne una cadena o string
vacío, ""

Escriba finalmente una función que reciba un número entero
de un dígito, es decir, un número entre 0 y 9, y retorne el
equivalente romano en decenas de ese número. Las decenas en
romano son: para el 1, es una "X", para el 2, es "XX", para el 3,
es "XXX", para el 4 es "XL", para el 5 es "L", y así
sucesivamente.

Ahora si, escriba un programa que lea un número entero, y si el
número tiene menos de 3 cifras, utilice las funciones anteriores,
para convertir el número a romanos (es decir, obtenga las
decenas y unidades del número, convierta las unidades a
romano, convierta las decenas a romano, e imprima ambos
string en pantalla). Si el número tiene 3 o más dígitos o es
negativo, se debe mostrar un mensaje de error.
 */
fun decena_unidad(numero:Int):Pair<Int,Int>{
    val unidad = numero%10
    val decena = (numero/10.0)
    return Pair(decena.toInt(),unidad)
}
fun NumerosRomanos(numero:Int):String{
    require(numero in 0..9)
    var romano = when(numero){
        1->"I"
        2->"II"
        3->"III"
        4->"IV"
        5->"V"
        6->"VI"
        7->"VII"
        8->"VIII"
        9->"IX"
        else->" "
    }
    return romano
}
fun NumerosRomanosDecenas(numero:Int):String{
    require(numero in 0..9)
    var romano = when(numero){
        1->"X"
        2->"XX"
        3->"XXX"
        4->"XL"
        5->"L"
        6->"LX"
        7->"LXX"
        8->"LXXX"
        9->"XC"
        else->" "
    }
    return romano
}

fun main(){

    print("Digite un numero: ")
    val numero = readln()!!.toInt()
    if(numero<=99){
        if(numero>=0){
            val unidad= decena_unidad(numero).second
            val decena = decena_unidad(numero).first
            val romano_u = NumerosRomanos(unidad)
            val romano_d = NumerosRomanosDecenas(decena)
            print(romano_d+romano_u)
          }
        else{
            print("Error")
        }

    }
    else{
        print("el numero es mayor a 2 cifras")
    }
}

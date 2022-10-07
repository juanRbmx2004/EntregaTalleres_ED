package ean.estructuradedatos.taller

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 18 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.IList
import ean.collections.TList
import ean.collections.newLinkedList
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int = when(n){
    0 -> 1
    1 -> 1
    else-> n * factorial(n-1)
}

/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int = when(n){
    1 -> 1
    2 -> 1
    else -> fibonacci(n-1)+ fibonacci(n-2)
}

/**
 * Permite determinar el término n,m del triángulo de Pascal
 * n = fila, m = término
 */
fun pascal(n: Int, m: Int): Int = when {
        m==n+1 || m==1 || n<=1 -> 1
        else -> pascal(n-1, m-1)+pascal(n-1,m)
    }

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int = when(b){
    0 -> 1
    1 -> a
    else -> a * elevar(a, b-1)
}

/**
 * Halla la suma de todos los números enteros entre 1 y n
 */
fun sumatoria(n: Int): Int = when(n){
    1 -> 1
    else -> n+sumatoria(n-1)
}

/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int = when(n){
    1 -> 1
    else -> Math.pow(n.toDouble(),2.0).toInt()+sumaCuadrados(n-1)
}

/**
 * Hallar el valor de la serie 1/(2i+1) desde  1 hasta n
 */
fun serie(n: Int): Double=when(n){
        1 -> (1/(2*n.toDouble()+1))
        else -> (1/(2*n.toDouble()+1))+serie(n-1)
    }


/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */

fun contarDigitos(n: Int): Int{
    if(n>0 && n<9){
        return 1
    }
    else{
        return contarDigitos(n/10)+1
    }
}



/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int{
    if(n>=1&&n<=9){
        return n
    }
    else{
        var m = (n/10.0) - (Math.floor(n/10.0))
        if((m*10-0.5) > Math.floor(m*10)){
            m = Math.ceil(m*10)
        }
        else{
            m = Math.floor(m*10)
        }
        return m.toInt()+ sumarDigitos(Math.floor(n/10.0).toInt())
    }

}

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - tiene una cifra y es 0, 3, 6, o 9
 *  - tiene más de una cifra y la suma de sus dígitos es múltiplo de 3
 *  - en cualquier otro caso, el número no es múltiplo de 3
 *
 *  - NO PUEDEN USAR LA OPERACIÓN MÓDULO (%)
 */
fun esMultiploDe3(n: Int): Boolean{
    var resultado = false
    var sumardigitos = sumarDigitos(n)
    if(sumardigitos>9){
        sumardigitos = sumarDigitos(sumardigitos)
    }
    if(sumardigitos==0 || sumardigitos==3 || sumardigitos==6 || sumardigitos==9){
        resultado = true
        return resultado
    }
    return resultado
}

/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int {
    if(n>=1&&n<=9){
        if (n%2 == 0){
            return 1
        }
        else{
            return 0
        }
    }
    else{
        var m = (n/10.0) - (Math.floor(n/10.0))
        if((m*10-0.5) > Math.floor(m*10)){
            m = Math.ceil(m*10)
        }
        else{
            m = Math.floor(m*10)
        }
        if(m%2 == 0.0){
            m = 1.0
        }
        else{
            m = 0.0
        }
        return m.toInt()+ cantidadDigitosPares(Math.floor(n/10.0).toInt())
    }
}

/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el numero 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean {
   if(n in 0..9){
       return n==0 || n==1
   }
    else{
        return if(n%10!=0||n%10!=1){
            esNumeroBinario(n/10)
        }else{
            false
        }
    }

}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean {
    if(n in 0..9){
        return if(n==digito){
            true
        }else{
            false
        }
    }
    else{
        if(n%10==digito){
             return true
        }
        else{
        return poseeDigito(n/10, digito)
        }
    }
}

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int {
    if (n in 0..9){
        return n
    }
    else{
        return if(n%10 >= digitoMasGrande(n/10)){
            n%10
        }
        else{
            digitoMasGrande(n/10)
        }
    }
}

/**
 * Imprimir cada elemento de la lista, pero de manera recursiva
 */
fun <T> imprimirLista(lista: IList<T>) {
    var tamaño = lista.size
    if(tamaño == 1){
        return println(lista.get(tamaño-1))
    }
    else{
        var ultimo = lista.last
        lista.remove(tamaño-1)
        return println("$ultimo ${imprimirLista(lista)}")
    }
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
    if (n<1){
        return TList()
    }
    else{
        return digitos(n/10) + TList(n%10)}
}



/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1,1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
    if(n==0 || n==1){
        return TList(n)
    }
    else{
        var lista:IList<Int> = convertirDecimalBinario(n/2)
        lista.add((n%10)%2)
        return lista
    }
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesLista(lista: IList<Int>): Int {
    if(lista.isEmpty){
        return 0
    }
    else{
        var primero = lista.first
        lista.remove(0)
        if(primero%2==0){
            return primero+ sumarParesLista(lista)
        }
        else{
            return sumarParesLista(lista)
        }
    }
}

/**
 * Recursión con listas: construir una función recursiva que retorne la posición del elemento en la lista
 * Si la lista está vacía, retorne -1. No se puede usar indexOf o lastIndexOf
 */
fun buscarElementoEnUnaLista(lista: IList<Int>, elem: Int,indice: Int): Int {
    var primero = 0
    if(!lista.isEmpty){
        primero = lista.first
    }
    if(primero == elem){
        return 0
    }else{
        lista.removeFirst()
        if(lista.isEmpty){
            return -1*indice-1
        }
        else{
            return buscarElementoEnUnaLista(lista,elem,indice+1)+1
        }
    }
}


/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    if(digitos.size == 1){
        return digitos.first
    }
    else{
        var primero = digitos.first
        digitos.removeFirst()
        var tamañoLista = digitos.size
        return primero*(Math.pow(10.0,tamañoLista.toDouble())).toInt()+ convertirListaDigitosNumero(digitos)
    }
}

/**
 * Función genérica y recursiva que permite saber si un elemento está dentro
 * de la lista. No debe usarse la función indexOf o contains. Debe ser
 * recursiva. Para buscar un elemento hay que tener en cuenta
 * - si la lista está vacía, el elemento no está
 * - si el primero de la lista es igual al elemento, retornamos true (el elemento está)
 * - sino es igual al primero, entonces hay que ver si el elemento está en el resto de la lista
 */
fun <T> existeElemento(lista: IList<T>, elem: T): Boolean {
    if(lista.isEmpty){
        return false
    }
    if(!lista.isEmpty&&lista.first == elem){
        return true
    }
    else{
        lista.removeFirst()
        return existeElemento(lista, elem)
    }
}

/** Escribir una función recursiva que, sin usar pilas ni colas
 * ni ninguna otra lista, obtenga la misma lista, pero invertida
 */
fun invertirLista(lista: IList<Char>): IList<Char> {
    if(lista.isEmpty){
        var inversa = lista
        return inversa
    }
    else {

        var primero = newLinkedList(lista.last)
        lista.removeLast()
        var inversa = primero + invertirLista(lista)
        return inversa
    }

}

/**
 * Una palabra es palíndrome si se lee igual de izquierda a derecha y de derecha
 * a izquierda. Esta función recibe la palabra (sin espacios) y de forma recursiva
 * determina si la palabra es palíndrome.
 */
fun esPalindrome(palabra: String): Boolean {
    if(palabra.length == 1){
        return true
    }
    else{
        var primero = palabra.first()
        var ultimo = palabra.last()

        if(primero == ultimo){
            var palabra1 = palabra.substring(1)
            palabra1 = palabra1.substring(0, palabra1.length-1)
            return esPalindrome(palabra1)
        }
        else{
            return false
        }
    }
}

/**
 * Recursividad con listas. Escriba una función recursiva
 * Obtiene el número más grande de la lista. Si la lista está vacía retorne el número
 * entero más pequeño.
 */
fun mayorDeUnaLista(lista: IList<Int>): Int {
    if(lista.isEmpty){
        return 0
    }
    else if(lista.size==1){
        return lista.first
    }
    else{
        val ultimo = lista.last
        val penultimo = lista.get(lista.size-2)
        if(ultimo>penultimo){
            lista.remove(lista.size-2)
        }
        else{
            lista.removeLast()
        }
        return mayorDeUnaLista(lista)
    }
}


/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int) {
    fun distanciaAlOrigen(): Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
}

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): Int {
    if(puntos.isEmpty){return 0}
    else{
         if(puntos.first.x<0 || puntos.first.y<0){
            return puntosPrimerCuadrante(puntos.tail())
        }else{
            var Pprimero = TList( puntos.first)
             puntos.removeFirst()
             return 1 + puntosPrimerCuadrante(puntos)
        }
    }
}

/**
 * Recursivamente, obtiene el punto que está más lejano del origen.
 * Si la lista esta vacía, retorne null
 * Si la lista tiene un solo elemento, retorne ese elemento
 * si la lista tiene más de un elemento, tome el primer elemento y
 * compárelo con el punto más lejano del resto de la lista.
 */
fun puntoMasLejano(puntos: IList<Punto>): Punto? {
    if(puntos.isEmpty){
        return null
    }
    else if(puntos.size==1){
        return puntos.first
    }
    else{
            val ultimo = puntos.last
            val penultimo = puntos.get(puntos.size-2)
            if(ultimo.distanciaAlOrigen()>penultimo.distanciaAlOrigen()){
                puntos.remove(puntos.size-2)
            }
            else{
                puntos.removeLast()
            }
            return puntoMasLejano(puntos)
    }
}

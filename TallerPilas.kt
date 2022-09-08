package ean.estructuradedatos.tallerpilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto Taller de Pilas
 * Autor: Universidad EAN - Marzo 11, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Ejercicio 01
 * Obtener el fondo de la pila
 */
fun <T> IStack<T>.bottom(): T {// esta funcion es O(n)
    var copia  = this.copy()
    var ultimo: T=copia.peek()
    while(!copia.isEmpty){
        ultimo = copia.peek()
        copia.pop()

    }
    return ultimo
}


/**
 * Ejercicio 02
 * Función para sumar los números pares de tres cifras que hay en una pila de enteros
 */
fun sumarParesTresCifras(pila: IStack<Int>):Int {// O(n)
    var copia = pila.copy()
    var ultimo:Int
    var suma = 0
    while(!copia.isEmpty){
        ultimo = copia.peek()
        if(ultimo>=100&&ultimo<=999){
            if(ultimo%2==0) {
                suma += ultimo
            }
        }
        copia.pop()
    }
    return suma
}

/**
 * Ejercicio 03
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe ningún número de dos cifras, retorne
 * null
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? {
   /* var copia = pila.copy()
    var ultimo:Int
    var listaDosCifras:MutableList<Int> = mutableListOf()
    while(!copia.isEmpty){
        ultimo = copia.peek()
        if(ultimo>=10&&ultimo<=99){
            listaDosCifras.add(ultimo)
        }
        copia.pop()
    }
    if(listaDosCifras.isEmpty()){
        return null
    }
    return listaDosCifras.max()

    */

    var copia = pila.copy()//O(n)
    var ultimo:Int
    var mayor: Int? =null
    while(!copia.isEmpty){
        ultimo = copia.peek()
        if(ultimo>=10&&ultimo<=99){
            if(mayor==null){
                mayor = 0
            }
            if(mayor<ultimo){
                mayor  = ultimo
            }
        }
        copia.pop()
    }

    return mayor
}

/**
 * Ejercicio 04
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T):IStack<T> {//O(n)
    var copia = p.copy()
    var pila: IStack<T> = TLinkedStack()
    pila.push(elem)
    while(!copia.isEmpty){
        var ultimo = copia.peek()
        pila.push(ultimo)
        copia.pop()
    }
    return pila

}

/**
 * Ejercicio 05
 * Función genérica para obtener el tamaño de una pila
 */
fun <T> tamPila(p: IStack<T>) : Int {// O(n)
    var copia = p.copy()
    var contador = 0
    while(!copia.isEmpty){
        copia.pop()
        contador++
    }
    return contador
}

/**
 * Ejercicio 06
 * Función genérica que permite Invertir una pila en otra. Recibe la pila y retorna la pila, pero invertida.
 * Solo puede usarse las operaciones de las pilas, no listas.
 */
fun <T> invertirPila(pila: IStack<T>): IStack<T> {//O(n)
    var copia = pila.copy()
    var p: IStack<T> = TLinkedStack()
    while(!copia.isEmpty){
        var ultimo = copia.peek()
        p.push(ultimo)
        copia.pop()
    }
    return p
}


/**
 * Ejercicio 07
 * Función genérica que copia una pila en otra.
 * La función recibe la pila y retorna la copia.
 * No debe usarse el método copy de la pila ni listas
 */
fun <T> copiarPila(pila: IStack<T>): IStack<T> {//O(n)
    var inversa:IStack<T> = TLinkedStack()
    while(!pila.isEmpty){
        var ultimo = pila.peek()
        inversa.push(ultimo)
        pila.pop()
    }
    return invertirPila(inversa)
}


/**
 * Ejercicio 08
 * Función genérica que recibe una pila y un elemento y que elimina de la
 * pila todas las ocurrencias del elemento que se recibe como parámetro.
 * No debe retornar nada.
 */
fun <T> eliminarElementoPila(pila: IStack<T>, elem: T) {//O(n^2)
    var copia:IStack<T> = TLinkedStack()
    while(!pila.isEmpty){
        var ultimo = pila.peek()
        if(ultimo != elem){
            copia.push(ultimo)
        }
        pila.pop()
    }
    while (!copia.isEmpty){
        var ultimo1 = copia.peek()
        pila.push(ultimo1)
        copia.pop()
    }

}

/**
 * Ejercicio 09
 * Invertir una lista de números utilizando una pila. La función no retorna,
 * debe modificar la lista
 */
fun invertirLista(list: IList<Int>) {//O(n^2)
    var pila:IStack<Int> = TLinkedStack()
    for(i in list){//O(n)
        var dato = i
        pila.push(dato)
    }
    list.clear()
    while(!pila.isEmpty){//O(n)
        var ultimo = pila.peek()
        list.add(ultimo)
        pila.pop()
    }
}


/**
 * Ejercicio 10
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean {//O(n^3)
    var CantString = frase.chars().count().toInt()
    var Pila1:TLinkedStack<Char> = TLinkedStack()
    var Pila2:TLinkedStack<Char> = TLinkedStack()
    var retorno = false
    for(i in 0 .. CantString-1){//O(n)
        var caracter = frase.get(i)
        Pila1.push(caracter)
    }
    var CopiaPila1 = Pila1.copy()
    while(!CopiaPila1.isEmpty){//O(n)
        var ultimo = CopiaPila1.peek()
        Pila2.push(ultimo)
        CopiaPila1.pop()
    }
    for(i in 1 .. CantString){//O(n)
        if(Pila1.peek() == Pila2.peek()){
            retorno = true
            Pila1.pop()
            Pila2.pop()
        }
        else{
            retorno = false
        }
    }
    return retorno

}

/**
 * Ejercicio 11
 * Determinar si dos pilas son iguales
 */
fun <T> igualesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean {//O(n)
    var copia1 = pila1.copy()
    var copia2 = pila2.copy()
    var retorno = false
    while (!copia1.isEmpty&&!copia2.isEmpty){//O(n)
        var ultimo1 = copia1.peek()
        var ultimo2 = copia2.peek()
        if(ultimo1!=null||ultimo2!=null){
            if(ultimo1==ultimo2){
                retorno = true
            }
            else{
                retorno = false
                break
            }
        }
        else{
            retorno = false
            break
        }
        copia1.pop()
        copia2.pop()
    }
    return retorno
}

class ProbarPila {
    @Test
    fun pruebaEjercicio01() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        println("La pila es $pila")
        println("El tope es ${pila.peek()}")
        println("El fondo es ${pila.bottom()}")

        assertEquals(1, pila.bottom())
    }

    @Test
    fun pruebaEjercicio02() {
        val p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(2500)
        p.push(100)
        p.push(125)
        p.push(81)

        assertEquals(350, sumarParesTresCifras(p))
    }

    @Test
    fun pruebaEjercicio03() {
        var p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(50)
        p.push(100)
        p.push(95)
        p.push(81)

        assertEquals(mayorDeDosCifras(p), 95)

        p.clear()
        p.push(3)
        p.push(4)
        p.push(5)

        assertNull(mayorDeDosCifras(p))

   }

    @Test
    fun pruebaEjercicio04() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        assertEquals(1, pila.bottom())

        guardarEnElFondo(pila, 10)

        var pila1 = guardarEnElFondo(pila, 10)

        assertEquals(10, pila1.bottom())
        println("Prueba superada!")
    }


    @Test
    fun pruebaEjercicio05() {
        val pila: IStack<String> = TLinkedStack()

        assertEquals(0, tamPila(pila))

        pila.push("Hola")
        pila.push("nano")
        pila.push("shell")
        pila.push("rojo")

        assertEquals(4, tamPila(pila))
    }

    @Test
    fun pruebaEjercicio06() {
        val pila: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila.push(elem)
        }

        val inv = invertirPila(pila)
        for (elem in lista) {
            assertEquals(elem, inv.peek())
            inv.pop()
        }
    }

    @Test
    fun pruebaEjercicio07() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 6, 4, 31)

        for (elem in lista) {
            pila.push(elem)
        }

        val copia = copiarPila(pila)
        for (n in lista.size - 1 downTo 0) {
            assertEquals(lista[n], copia.peek())
            copia.pop()
        }
    }

    @Test
    fun pruebaEjercicio08() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 5, 4, 31, 5)

        for (elem in lista) {
            pila.push(elem)
        }

        eliminarElementoPila(pila, 5)

        for (n in lista.size - 1 downTo 0) {
            if (lista[n] != 5) {
                assertEquals(lista[n], pila.peek())
                pila.pop()
            }
        }
        assertTrue { pila.isEmpty }
    }

    @Test
    fun pruebaEjercicio09() {
        val lista = TList(8, 1, 7, 6, -4, 5, 1, 31)
        val invlst = lista.copy()

        invertirLista(lista)

        for (i in 0 until lista.size) {
            assertEquals(lista[i], invlst[lista.size - i - 1])
        }
    }

    @Test
    fun pruebaEjercicio10() {
        assertTrue { palindrome("nosubasabuson") } //si
        assertTrue { palindrome("lavanesabasenaval") }//si
        assertTrue { palindrome("logracasillasallisacargol") }//si
        assertFalse { palindrome("arrozconleche") }//no
    }

    @Test
    fun pruebaEjercicio11() {
        val pila1: IStack<String> = TLinkedStack()
        val pila2: IStack<String> = TLinkedStack()
        val pila3: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila1.push(elem)
            pila2.push(elem)
            pila3.push(elem)
            pila3.push(elem)
        }

        assertTrue(igualesPilas(pila1, pila2))
        assertFalse(igualesPilas(pila3, pila2))
    }


}
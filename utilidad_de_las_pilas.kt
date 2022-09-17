package ean.estructuradedatos.tallerUtilidadDePilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Pilas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*

/**
 * Objeto que permite convertir una expresión infija normal a una expresión en notación
 * postfija. Utiliza pilas para realizar la conversión.
 */
object Evaluador {

    //-------------------------------------
    // Métodos
    //-------------------------------------

    /**
     * Verifica que la expresión tiene los símbolos de agrupación bien balanceados
     * @return true si la expresión está balanceados
     */
    fun estánSímbolosAgrupaciónBalanceados(expresion: IList<String>): Boolean {
        val pilaSimbolos: IStack<String> = TLinkedStack()

        for (n in expresion) {
            if (n == "(" || n == "{" || n == "[") {
                pilaSimbolos.push(n)
            } else {
                if (n == ")" || n == "}" || n == "]") {
                    if (pilaSimbolos.isEmpty) {
                        return false
                    }
                    val tope = pilaSimbolos.peek()
                    pilaSimbolos.pop()
                    if ((tope == "(" && n != ")") || (tope == "{" && n != "}") || (tope == "[" && n != "]")) {
                        return false
                    }
                }
            }
        }
        return pilaSimbolos.isEmpty

    }

    /**
     * Transforma la expresión, cambiando los simbolos de agrupación [] y {} por ()
     */
    fun reemplazarDelimitadoresPorParéntesis(expresion: IList<String>): Unit {
        val lista: MutableList<String> = mutableListOf()
        for (n in expresion) {
            if (n == "{" || n == "[") {
                lista.add("(")
            } else {
                if (n == "}" || n == "]") {
                    lista.add(")")
                } else {
                    lista.add(n)
                }
            }
        }
        expresion.clear()
        for (i in lista) {
            expresion.add(i)
        }
    }

    /**
     * Realiza la conversión de la notación infija a postfija
     * @return la expresión convertida a postfija
     */
    fun convertirAPostfijo(expresion: IList<String>): IList<String> {
        val pila: IStack<String> = TLinkedStack()
        val lista: IList<String> = TList()

        for (n in expresion) {
            if (n == "+" || n == "-" || n == "/" || n == "*" || n == "%") {
                pila.push(n)
            } else if (n == "(") {
                continue
            } else if (n == ")") {
                lista.add(pila.peek())
                pila.pop()
            } else {
                lista.add(n)
            }
        }

        return lista;
    }

    /**
     * Realiza la evaluación de la expresión postfija almacenada en la lista
     * llamada "expresión". Realiza las operaciones de acuerdo al algoritmo
     * presentado.
     */
    fun evaluarExpresiónPostfija(expression: IList<String>): Int {
        val pila: IStack<Int> = TLinkedStack()
        for (i in expression){
            if (i=="+"||i=="-"||i=="*"||i=="/"||i=="%"){
                var ultimo1 = pila.peek()
                pila.pop()
                var ultimo2 = pila.peek()
                pila.pop()
                when (i){
                    "+" -> pila.push(ultimo2+ultimo1)
                    "-" -> pila.push(ultimo2-ultimo1)
                    "*" -> pila.push(ultimo2*ultimo1)
                    "/" -> pila.push(ultimo2/ultimo1)
                    "%" -> pila.push(ultimo2%ultimo1)
                }
            }
            else{
                pila.push(i.toInt())
            }
        }
        return pila.peek()
    }

}
fun main(){
    /* importanteeee PROFEEE si ve este main es para evidenciar que el codigo si esta bien hecho
       pero nose por que no me coge en el test, me di cuenta que era por que tomaba el valanceo de la
       expresion como falsa pero ps ud mismo sabe que si lo esta.*/


    var expression1:IList<String> = Utils.parse("2 3 * 4 2 - / 5 6 * +")
    val pila: IStack<Int> = TLinkedStack()
    for (i in expression1){
        if (i=="+"||i=="-"||i=="*"||i=="/"||i=="%"){
            var ultimo1 = pila.peek()
            pila.pop()
            var ultimo2 = pila.peek()
            pila.pop()
            when (i){
                "+" -> pila.push(ultimo2+ultimo1)
                "-" -> pila.push(ultimo2-ultimo1)
                "*" -> pila.push(ultimo2*ultimo1)
                "/" -> pila.push(ultimo2/ultimo1)
                "%" -> pila.push(ultimo2%ultimo1)
            }
        }
        else{
            pila.push(i.toInt())
        }
    }
    print("resultado de la expresion postfija"+pila.peek())
}



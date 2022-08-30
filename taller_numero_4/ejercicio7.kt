package taller_numero_4

fun main(){
    var contador = 1
    var contadorConsumidor = 0
    var muejerMenor= 0
    var hombreNoConsume = 0
    var edadesNoCerveza = 0
    var CedadesNoCerveza = 0
    var sumaWhisky = 0
   do{
       print("\nPreguntas persona #$contador")
       print("\nConsume licor (si,no) en minusculas: ")
       var si_no = readln()
       println("\n---Licor preferido elige un opcion: ---")
       println("1. Aguardiante")
       println("2. Ron")
       println("3. Cerveza")
       println("4. Tequila")
       println("5. Whisky")
       println("6. Otro")
       print("\n digite la opcion: ")
       var Licor = readln().toInt()
       print("\nDigite la edad: ")
       var edad = readln().toInt()
       print("\nDigite el sexo (M,H) en mayusculas: ")
       var sexo = readln()
       if(si_no=="si"){
           contadorConsumidor += 1

       }
       if(sexo=="M"&&edad<18){
           muejerMenor+=1
       }
       if(si_no=="no"&&sexo=="H"&&edad>=20&&edad<=25){
           hombreNoConsume +=1
       }
       if(Licor==3){
           edadesNoCerveza +=edad
           CedadesNoCerveza +=1
       }
       if(Licor ==5){
           sumaWhisky+=1
       }

        print("Para salir del programa digite 0 de lo contrario cualquier numero: ")
       var condicion = readln().toInt()
       if(condicion==0){
           break
       }
       contador++


   }while(true)

   println("\nTotal personas consumen licor: $contadorConsumidor")
    println("Total mujeres menor edad: $muejerMenor")
    println("Total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años de edad: $hombreNoConsume")
    var promedio = edadesNoCerveza/CedadesNoCerveza
    println("Promedio de edad de las personas que consumen cerveza: $promedio")
    var porcentaje = sumaWhisky*100/contador
    println("Porcentaje de personas que consumen whisky en relación con el total encuestado: $porcentaje%")

}
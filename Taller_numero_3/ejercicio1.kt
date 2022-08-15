package Taller_numero_3

fun precioNeto(PrecioLibro:Double):Double=
    when{
        PrecioLibro<100_000 -> PrecioLibro*0.88
        else-> PrecioLibro*0.82

}

fun main(){
    var precio=0.1
    print("Cual es el precio del libro: ")
    precio = readLine()!!.toDouble()
    while(precio>0){

        print("\nCual es el precio del libro: ")
        println("El precio neto del libro es ${precioNeto(precio)}")
        precio = readLine()!!.toDouble()
    }
}
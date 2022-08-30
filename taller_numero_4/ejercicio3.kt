package taller_numero_4

fun main(){
    var listaMunicipios:MutableList<Triple<String,Int,String>> = mutableListOf()
    var contador = 1
    do{
        print("\nNombre municipio #$contador: ")
        var nombre = readln().toString()
        if(nombre == ""){
            break
        }
        print("Poblacion del monicipio #$contador: ")
        var poblacion = readln().toInt()
        if(poblacion <=0){
            break
        }
        print("Depratamente del municipio #$contador: ")
        var departamento = readln().toString()
        listaMunicipios.add(Triple(nombre,poblacion,departamento))
        contador++
    }while(true)
    var listaPoblacion:MutableList<Int> = mutableListOf()
    for((nom,pobl,depart) in listaMunicipios){
        listaPoblacion.add(pobl)
    }
    var menor = listaPoblacion.min()
    var inidice = listaPoblacion.indexOf(menor)
    var nombreMenor = listaMunicipios.get(inidice).first

    print("El municipio de menor poblacion es: ${nombreMenor}")
}
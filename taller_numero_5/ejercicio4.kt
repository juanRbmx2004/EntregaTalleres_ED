package taller_numero_5

    fun NotasEstudiantes(listaN:MutableList<Float>):Pair<Int,Float>{
        var suma = 0
        var promedio = 0.0.toFloat()
        for(i in listaN){
            if(i>=60){
                suma+=1
            }
            promedio+=i
        }
        return Pair(suma,promedio/listaN.size)
    }
    
    fun main(){
        var listaN: MutableList<Float> = mutableListOf()
        do {
    
            print("Digite la nota (para dejar de preguntar digite un numero menor a cero): ")
            var nota = readLine()!!.toFloat()
            if(nota<0.0.toFloat()){
                break
            }
            listaN.add(nota)
    
        }while(true)
        var (pasaron,promedio) = NotasEstudiantes(listaN)
    
        println("Estudiantes que pasaron: $pasaron, Perdieron: ${(listaN.size)-pasaron}")
        println("El promedio de las notas es de: $promedio")
    }


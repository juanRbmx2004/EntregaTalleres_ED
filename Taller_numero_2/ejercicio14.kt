package Taller_numero_2




fun MayorHermano(Hermano1:Array<String>,Hermano2:Array<String>,Hermano3:Array<String>):Pair<String,String>{
    if(Hermano1[1].toInt()>Hermano2[1].toInt()&&Hermano1[1].toInt()>Hermano3[1].toInt()){
        return Pair(Hermano1[0],Hermano1[1])
    }
    else if(Hermano2[1].toInt()>Hermano1[1].toInt()&&Hermano2[1].toInt()>Hermano3[1].toInt()){
        return Pair(Hermano2[0],Hermano2[1])
    }
    else{
        return Pair(Hermano3[0],Hermano3[1])
    }
}
fun main(){
    val hermano1 = arrayOf("","")
    val hermano2 = arrayOf("","")
    val hermano3 = arrayOf("","")
    print("nombre hermano#1: ")
    hermano1[0]= readLine()!!.toString()
    print("Edad hermano#1: ")
    hermano1[1]= readLine()!!.toString()
    print("nombre hermano#2: ")
    hermano2[0]= readLine()!!.toString()
    print("Edad hermano#2: ")
    hermano2[1]= readLine()!!.toString()
    print("nombre hermano#3: ")
    hermano3[0]= readLine()!!.toString()
    print("Edad hermano#3: ")
    hermano3[1]= readLine()!!.toString()
    val firsts = MayorHermano(hermano1,hermano2,hermano3).first
    val seconds = MayorHermano(hermano1,hermano2,hermano3).second
    print("El nombre del hermano mayor es: ${firsts}, y la edad es: ${seconds}")
}
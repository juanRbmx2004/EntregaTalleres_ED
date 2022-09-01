package taller_numero_6

class Asensor{
    private var CantPisos:Int=0
    private var CantSotanos:Int=0
    private var PisoNaw:Int=1
    constructor()
    constructor(CantPisos:Int,CantSotanos:Int,PisoNaw:Int){
        this.CantPisos=CantPisos
        this.CantSotanos=CantSotanos
        this.PisoNaw=PisoNaw
    }

    fun getCantPisos()=this.CantPisos
    fun getCantSotanos()=this.CantSotanos
    fun getPisoNaow()=this.PisoNaw
    fun setCantPisos(nuevo:Int){
        this.CantPisos=nuevo
    }
    fun setCantSotano(nuevo:Int){
        this.CantSotanos=nuevo
    }
    fun setPisoNaw(nuevo:Int){
        this.PisoNaw=nuevo
    }
    fun SubirUnPiso(Pisos:MutableList<Int>):Int{
        var Indice_pisoActual = Pisos.indexOf(PisoNaw)
        if(this.PisoNaw==Pisos.max()){
           return this.PisoNaw
        }
        return Pisos.get((Indice_pisoActual+1))
    }

    fun BajarUnPiso(Pisos:MutableList<Int>):Int{
        var Indice_pisoActual = Pisos.indexOf(PisoNaw)
        if(this.PisoNaw==Pisos.minOrNull()){
            return this.PisoNaw
        }
        return Pisos.get((Indice_pisoActual-1))

    }

    fun PisosAtener(Pisos:MutableList<Int>):Int{
        return Pisos.size
    }



}

fun main(){
    var Pisos:MutableList<Int> = mutableListOf()
    var acensor = Asensor()
    do{

        print("----Menu Opciones-----")
        print("\n1. Subir acensor")
        print("\n2. bajar acensor")
        print("\n3. servicios del acensor")
        print("\n4. crear nuevo acensor")
        print("\n5. salir del programa")
        var opcion = readln().toInt()
        if(opcion == 4){
            print("\ncuantos pisos tiene el edificion: ")
            var pisosPositivos = readln().toInt()
            print("\ncuantos sotanos: ")
            var pisosSotani = readln().toInt()
            print("\npiso actual del ascensor: ")
            var nawPiso = readln().toInt()
            var cantPisos = pisosPositivos+pisosSotani
            acensor = Asensor(cantPisos,pisosSotani,nawPiso)
            repeat(pisosSotani){
                var pisoSotanoAñador = -(pisosSotani-(it-1))
                Pisos.add(pisoSotanoAñador)
            }
            repeat(pisosPositivos){
                Pisos.add(it)
            }
        }
        else if(opcion==1){
            print("\nPiso a subir: ${acensor.SubirUnPiso(Pisos)}")
        }
        else if(opcion==2){
            print("\n piso a bajar: ${acensor.BajarUnPiso(Pisos)}")
        }
        else if(opcion == 3){
            print("\npisos a atender ${acensor.PisosAtener(Pisos)}")
        }
        else if(opcion == 5){
            print("\nHas salido")
            break
        }
        else{
            print("\nOpcon incorrecta")
        }

    }while(true)
}
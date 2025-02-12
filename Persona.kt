open class Persona(
    val nombre:String,
    var edad:Int
) {

    fun celebrarCumple(){
        edad++
        println("Feliz cumpleaños $nombre! Ahora tienes $edad años.")
    }
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}
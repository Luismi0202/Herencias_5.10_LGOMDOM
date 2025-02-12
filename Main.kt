

fun main(){
    val personita = Persona("Juan",50)
    personita.celebrarCumple()
    println("************************************")

    val empleaducho = Empleado(505,29.9,"Julian",20)
    empleaducho.celebrarCumple()
    empleaducho.calcularSalario()
    println(empleaducho.trabajar())
    println(empleaducho)
    println("************************************")

    val gerentito = Gerente(989.4,40,"Paco",40,890)
    println(gerentito.trabajar())
    println(gerentito)
    gerentito.celebrarCumple()
    println(gerentito.administrar())
}
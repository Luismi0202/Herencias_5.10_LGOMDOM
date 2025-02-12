import kotlin.math.round

open class Empleado(
    var salarioBase: Number,
    var porcentajeImpuestos: Number = 10.0,
    nombre: String,
    edad: Int
) : Persona(nombre, edad) {

    open fun calcularSalario(): Double {
        return (salarioBase.toDouble() * porcentajeImpuestos.toDouble()) / 100
    }

    fun trabajar(): String {
        return "$nombre está trabajando en la empresa"
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad:$edad, Salario:${String.format("%.2f",calcularSalario())}€"
    }
}

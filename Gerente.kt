import kotlin.math.round

class Gerente(
    salarioBase: Number,
    porcentajeImpuestos: Number,
    nombre: String,
    edad: Int,
    var bonus: Number,
    var exentoImpuestos: Boolean = false
):Empleado(salarioBase, porcentajeImpuestos = 33.99,nombre,edad) {

    override fun calcularSalario(): Double {
        if(!exentoImpuestos){
            return super.calcularSalario() + bonus.toDouble()
        }
        else{
            return salarioBase.toDouble() + bonus.toDouble()
        }
    }

    fun administrar():String{
        return "$nombre está administrando la empresa"
    }

    private fun impuestos():String{
        if(exentoImpuestos){
            return "Si"
        }
        return "No"
    }

    override fun toString(): String {
        return "Nombre:$nombre, Edad:$edad, Salario:${String.format("%.2f", calcularSalario())}, Base:$salarioBase, Bonus:$bonus, Excento de impuestos:{${impuestos()}}"

    }
}
/*
* Este tema consiste es poder sobrecargar los operadores que el lenguaje
* nos provee dandole mas funcionalidad segun se requiera
*/

data class Tiempo(val years: Int, val days: Int) {}

operator fun Tiempo.plus(other: Tiempo) : Tiempo{
    return Tiempo(this.years + other.years,
                    this.days + other.days)
}

//A este objeto se le modifico o sobreescrivio el posible metodo inc() de incremento
data class  Contador(val index: Int){
    operator fun inc():Contador {
        return Contador(index + 1)
    }
}

fun main(args: Array<String>) {
    val tiempo1: Tiempo = Tiempo(2000, 30)
    val tiempo2: Tiempo = Tiempo(100, 2)

    val sumaDelTiempo = tiempo1 + tiempo2

    println(sumaDelTiempo)

    var contador: Contador = Contador(5)
    println(contador.inc())
    println(++contador)

}
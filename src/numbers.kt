//fun main(){
//    println("Por favor, ingrese un número: ")
//    var numeroIngresado = readln()?:""
//    var numeroConvertido = numeroIngresado.toInt()
//    var doubleVariable = 123456789123456
//    var multiplicacion = numeroConvertido * doubleVariable
//    println("El número ingresado fue: ${numeroConvertido}, y multiplicado por el long es: ${multiplicacion}")
//    println("El tipo de número es: ${multiplicacion::class.java}")
//}

fun main(){
    println("Ingrese la cant de dinero de su cuenta: ")
    var dineroIngresado = readln()
    var dinero = dineroIngresado.toInt()
    var dineroTriplicado = dinero * 3
    println("La cantidad total de dinero ganado en el concurso es ${dineroTriplicado}")
}
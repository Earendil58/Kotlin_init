fun main(){
    println("Por favor, ingrese un número: ")
    var numeroIngresado = readln().toInt()
    var doubleVariable = 123456789123456
    var multiplicacion = numeroIngresado * doubleVariable
    println("El número ingresado fue: ${numeroIngresado}, y multiplicado por el long es: ${multiplicacion}")
    println("El tipo de número es: ${multiplicacion::class.java}")
}
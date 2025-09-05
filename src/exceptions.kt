//fun main(){
//    println("Ingrese un número: ")
//    var test = readln()
//    try{
//        println(test?.toInt())
//    } catch (error: Exception){
//        error.printStackTrace()
//        println("Ha ocurrido un error: ${error} \n${error.localizedMessage}")
//    } finally {
//        println("Se terminó la ejecución")
//    }
//}

//fun main(){
//    println("Ingrese un número: ")
//    var input = readln()
//    try{
//        println(input?.toInt())
//    } catch (error: Exception){
//        throw IllegalStateException("No me gustó este input, perro: ${error}")
//    }
//}

//fun main(){
//    println("Ingresa un número: ")
//    var input = readln()
//    try {
//        var numero = input?.toInt()
//        var numeroPorCinco = numero?.times(5)
//        println("El número ingresdo fue ${input}, multiplicado por 5 es = ${numeroPorCinco}")
//    } catch (error: Exception){
//        println("Ha ocurrido un error: ${error} " +
//                "${error.localizedMessage}")
//    }
//}

fun main(){
    val valorProducto : Double = 9.99

    println("Ingrese el producto a comprar: ")
    var inputProducto = readln()

    println("Ingrese la cantidad a comprar de ese producto: ")
    var inputCantidad = readln()

    try {
        var cantidad = inputCantidad?.toInt()
        var precioTotal = cantidad?.times(valorProducto)
        println("El precio total de la compra es de $ ${precioTotal}, usted compró: ${inputProducto}")
    } catch (error: Exception){
        println("Hubo un error: ${error}")
    }
}
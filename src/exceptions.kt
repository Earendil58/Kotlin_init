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

fun main(){
    println("Ingresa un número: ")
    var input = readln()
    try {
        var numero = input?.toInt()
        var numeroPorCinco = numero?.times(5)
        println("El número ingresdo fue ${input}, multiplicado por 5 es = ${numeroPorCinco}")
    } catch (error: Exception){
        println("Ha ocurrido un error: ${error} " +
                "${error.localizedMessage}")
    }
}
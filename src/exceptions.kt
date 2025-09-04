fun main(){
    var test = readln()
    try{
        println(test?.toInt())
    } catch (error: Exception){
        println("Ha ocurrido un error: ${error}")
    }
}
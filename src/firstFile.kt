fun main(){
    val name:String = "My cat's name is \"Fluffy\""
    println(name)
    println("La lontitud del los caracteres en name es de ${name.length}")

    var slashes:String = "Two type of slashes: / and \\"
    println(slashes)

    val bunny: String = "(\\ (\\ \n" +
            "(-.-) \n" +
            "0_(\"(\""
    println(bunny)

    val multiString: String = """Este es
        |una linea,
        |multiple
    """.trimMargin()
    println(multiString)

    var capitalizar: String = "Hola".uppercase()
    println(capitalizar)

    var nombrePerro: String = "Pupillo"
    println("El nombre de mi perrita es $nombrePerro")

    var myCar: String = "My car won't start"
    var stringCar: String = myCar.substring(3,6)
    println(stringCar)
}
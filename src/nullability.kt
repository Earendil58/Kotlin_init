fun main(){
    var nombre: String = "Lord Carlos" // no puede ser null

    var apellido: String? = "Menem" // si puede ser null
    apellido = null

    //SAFE CALL OPERATOR - EJECUTA LA OPERACION SOLO SI EL OBJETO NO ES NULL:

    val texto: String? = "Hola" //acá detecta que el string siempre va a ser no-null, porque justamente tiene un valor de string
    val longitud = texto?.length //con esto digo que si el valor es no-null ejecute la verificacion de longitud

    println("La longitud de 'Hola' es ${longitud}")
    println(longitud!!::class.java)

    val textoNull: String? = null //acá le digo que le puedo pasar string pero puede ser null, de hecho lo es
    val longitudNull = textoNull?.length // esto hace que me devuelve null sin tirar excepción

    println("La longitud de 'textoNull' es ${longitudNull}")

    //ELVIS OPERATOR - PROPORCIONA UN VALOR POR DEFECTO, CUANDO ALGO ES NULL:

    val direccion: String? = null
    val direccionFinal = direccion?: "Sin nombre" //si nombre es null, usa Sin nombre

    val longitudDireccion: Int? = direccionFinal?.length
    val longitudDireccionNull: Int? = direccion?.length

    println("La direccion final es ${direccionFinal}")
    println("La longitud de la dirección final es de ${longitudDireccion}")
    println("La longitud de la dirección null es de ${longitudDireccionNull}")

    //Not-Null Assertion !!: convierte un tipo nullable a non-nullable, pero puede lanzar excepcion:
    val kawirpi: String? = "Hola"
    val longitudKawirpi = kawirpi!!.length // Si texto es null, lanza KotlinNullPointerException
    // esto es para decir algo así como "confia en mi" yo sé que no va a venir null

    //SAFE CAST: Intenta hacer un cast y devuelve null si no es posible:
    val objeto: Any = "Hola"
    val castearObjeto: String? = objeto as? String // Devuelve "Hola"

    val numero: Any = 42
    val numeroATexto: String? = numero as? String
    println("Numero a texto: ${numeroATexto}")


}
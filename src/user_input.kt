fun main() {
    val AÑO: Int = 2025
    println("Ingresa el año de tu nacimiento: ")
    val añoNacimiento: Int = readln().toInt()
    println("Tu edad es: ${AÑO - añoNacimiento}")

    println(AÑO::class.java)
}

fun main(){
    var coso: String? = "Stegosaurio"
    println("Las letras de la 3 a la 6 son ${coso?.substring(3..7)}")

    var numero: Double? = 36.45
    var numeroMultiPorSeis = numero?.times(6)
    var numeroAFloat = numeroMultiPorSeis?.toFloat()

    println("El número es ${numeroAFloat}")
    println(numeroAFloat!!::class.java)

    println("Ingrese su nombre: ")
    var userName: String? = readln()
    var userNameLength = userName?.length

    println("La longitud del nombre del usuario es de ${userNameLength}")

    println("Ingrese un número")
    var numeroDos = readln()
    var numeroDosADouble = numeroDos?.toDouble()
    var numeroDosPorSiete = numeroDosADouble?.times(7)

    println("El número ingresado fue ${numeroDosADouble} y multiplicado por 7 da ${numeroDosPorSiete}")

    var product = 29.99
    var input = readln()
    var purchaseProducts = input?.toInt()?: 3
    println("El precio total de la compra es de $${product?.times(purchaseProducts)}")

}
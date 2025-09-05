fun main() {
    // List: ordenada, permite duplicados
    val frutas = mutableListOf("Manzana", "Banana", "Banana")
    frutas.add("Naranja")
    println(frutas) // [Manzana, Banana, Banana, Naranja]

    // Set: únicos, sin orden
    val numeros = setOf(1, 2, 2, 3)
    println(numeros) // [1, 2, 3]

    // Map: clave → valor
    val edades = mutableMapOf("Ana" to 25, "Luis" to 30)
    edades["Pedro"] = 40
    println(edades) // {Ana=25, Luis=30, Pedro=40}

    // Array: tamaño fijo
    val arr = arrayOf(10, 20, 30)
    println(arr[1]) // 20
}

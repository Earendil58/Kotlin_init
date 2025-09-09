

fun main(){
    val lista = listOf(1,2,3,4,5) //Lista inmutable
    println(lista)

    val listaMutable = mutableListOf("a", "b", "c", "d")
    listaMutable.add("e")
    println(listaMutable)
    listaMutable[0] = "x"
    println(listaMutable)
}
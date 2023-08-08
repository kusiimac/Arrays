/**
 1. create an array of 50 integers and use a for loop to print out the names of the integer
 */
fun main () {
    val integersArray = IntArray(50) { it + 1 }
    for (name in integersArray)
        println(name)
}
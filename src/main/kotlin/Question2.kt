/**
 2. create an array of 6 doubles and print out the sum of all elements in the array
 */
fun main() {
    val d = DoubleArray(6)
    d[0] = 1.4
    d[1] = 5.6
    d[2] = 2.5
    d[3] = 1.7
    d[4] = 7.4
    d[5] = 1.5
    val s = d.sum()
    println("The sum of elements is $s")
}
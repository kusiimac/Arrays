/**
 3. in a class, there are five students; Ivan, Aron, Grace, Nisah, and Christine. Create an array
    in this order and afterwards, print the result of the elements in alphabetical order
 */
fun main(){
    val studentName = arrayOf("Ivan", "Aron", "Grace", "Nisah", "Christine")
    studentName.sort()
    for (name in studentName)
    println(name)
}
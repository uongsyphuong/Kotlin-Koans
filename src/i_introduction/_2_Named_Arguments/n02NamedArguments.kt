package i_introduction._2_Named_Arguments

// default values for arguments
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments
    bar(1, b = false)
}

fun todoTask2(): String = "nnn"
fun task2(collection: Collection<Int>): String {
    todoTask2()
    val temp:String = collection.joinToString()
    return "{$temp}"
}
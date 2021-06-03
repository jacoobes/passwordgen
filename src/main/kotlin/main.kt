
import java.lang.RuntimeException


fun main(args: Array<String>) {


     println("How long do you want your password to be?")

    val howLong = readLine()?.toIntOrNull() ?: throw RuntimeException("Not a number!")
    println(passwordGen(howLong))
}

fun passwordGen( length: Int) : String {
    var len = length
    return generateSequence { (('a'..'z') + ('A'..'Z') + ('1'..'9')).random().takeIf { len != 0 }
        .also { len-- }  }
        .toList()
        .joinToString("")
}
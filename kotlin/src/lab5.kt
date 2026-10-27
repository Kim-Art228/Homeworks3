////Task 1
//fun main() {
//    val letter: Char = 'K'
//    val word: String = "K"
//
//    println("letter = $letter")
//    println("word = $word")
//    println("word[0] = ${word[0]}")
//}
//
//
////Task 2
//fun main() {
//    print("Enter a line: ")
//    val line = readln()
//
//    if (line.isEmpty()) {
//        println("Empty input")
//    } else {
//        println("first = ${line[0]}")
//        println("last = ${line[line.length - 1]}")
//    }
//}
//
//
////Task 3
//fun main() {
//    print("Enter char: ")
//    val line = readln()
//
//    if (line.isNotEmpty()) {
//        val ch = line[0]
//        val classification = when (ch) {
//            in '0'..'9' -> "Digit"
//            in 'A'..'Z' -> "Uppercase"
//            in 'a'..'z' -> "Lowercase"
//            else -> "Other"
//        }
//        println(classification)
//    } else {
//        println("Empty input")
//    }
//}
//
//
////Task 4
//fun main() {
//    print("Enter a digit character (e.g. 7): ")
//    val line = readln()
//
//    if (line.isNotEmpty()) {
//        val ch = line[0]
//        val value = ch - '0'
//
//        println("value = $value")
//        println("value * 2 = ${value * 2}")
//    }
//}
//
//
////Task 5
//fun main() {
//    print("Enter text: ")
//    val text = readln()
//
//    var count = 0
//    for (ch in text) {
//        if (ch.isLetter()) {
//            count++
//        }
//    }
//
//    println("Letters: $count")
//}
//
//
////Task 6
//fun main() {
//    print("Enter text: ")
//    val text = readln()
//
//    var result = ""
//    for (ch in text) {
//        if (ch.isLetter()) {
//            result += ch
//        }
//    }
//
//    println(result)
//}
//
//
////Task 7
//fun main() {
//    print("Enter a character: ")
//    val line = readln()
//
//    if (line.isNotEmpty()) {
//        val ch = line[0]
//        println("isDigit(): ${ch.isDigit()}")
//        println("isLetter(): ${ch.isLetter()}")
//        println("isWhitespace(): ${ch.isWhitespace()}")
//        println("lowercaseChar(): ${ch.lowercaseChar()}")
//        println("uppercaseChar(): ${ch.uppercaseChar()}")
//    } else {
//        println("Empty input")
//    }
//}
//
//
////Task 8
//fun main() {
//    print("Enter a lowercase letter ('a'..'z'): ")
//    val line = readln()
//
//    if (line.isNotEmpty()) {
//        val ch = line[0]
//        if (ch in 'a'..'z') {
//            // Shift forward by 1 with wrap-around using modulo arithmetic
//            val shifted = 'a' + (ch - 'a' + 1) % 26
//            println("Shifted: $shifted")
//        } else {
//            println(ch)
//        }
//    }
//}
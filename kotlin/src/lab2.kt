// Task1
//fun main() {
//    print("Enter n: ")
//    val n = readln().toInt()
//
//    println("triple = ${3 * n}")
//    println("square = ${n * n}")
//}


// Task2
//fun main() {
//    print("Enter integer a: ")
//    val a = readln().toInt()
//
//    print("Enter integer b: ")
//    val b = readln().toInt()
//
//    println("quotient = ${a / b}")
//    println("remainder = ${a % b}")
//    println("exact = ${a.toDouble() / b}")
//}


// Task3
//fun main() {
//    print("Enter total seconds: ")
//    val totalSeconds = readln().toInt()
//
//    val hours = totalSeconds / 3600
//    val remainderAfterHours = totalSeconds % 3600
//    val minutes = remainderAfterHours / 60
//    val seconds = remainderAfterHours % 60
//
//    println("H:M:S -> $hours:$minutes:$seconds")
//}


// Task4
//fun main() {
//    var score = 0
//
//    print("Enter first integer: ")
//    score += readln().toInt()
//
//    print("Enter second integer: ")
//    score += readln().toInt()
//
//    print("Enter third integer: ")
//    score += readln().toInt()
//
//    println("Final score: $score")
//}


// Task5
//fun main() {
//    print("Enter temperature in Celsius: ")
//    val c = readln().toDouble()
//
//    val f = c * 9.0 / 5.0 + 32.0
//
//    println("C = $c")
//    println("F = $f")
//
//    val isBelowFreezing = f < 32.0
//    println("Below freezing: $isBelowFreezing")
//}


// Task6
//fun main() {
//    val basePopulation: Long = 8_100_000_000L
//
//    print("Enter extra people to add (Int): ")
//    val extra = readln().toInt()
//
//    val total = basePopulation + extra.toLong()
//
//    println("Base: $basePopulation")
//    println("Extra: $extra")
//    println("Total: $total")
//}


// Task7
//fun main() {
//    val small: Byte = 100
//    val medium: Short = 20_000
//
//    // Arithmetic operations on smaller types promote to Int
//    val sum = small + medium
//
//    println("Sum: $sum")
//    println("Type of sum: ${sum::class.simpleName}") // Prints "Int"
//}


// Task8
//fun main() {
//    print("Enter price (Double): ")
//    val price = readln().toDouble()
//
//    print("Enter quantity (Int): ")
//    val quantity = readln().toInt()
//
//    // Compute price * quantity once, store in a var, then apply a 10% discount
//    var total = price * quantity
//    total = total * 0.9 // Applying 10% discount
//
//    println("Total after 10% discount: $total")
//}
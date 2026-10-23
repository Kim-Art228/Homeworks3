// // Task1
//fun main() {
//    print("Enter score: ")
//    val score = readln().toInt()
//
//    if (score >= 50) {
//        println("Pass")
//    } else {
//        println("Fail")
//    }
//}


//// Task2
//fun main() {
//    print("Enter temperature (°C): ")
//    val temp = readln().toInt()
//
//    if (temp < 0) {
//        println("Freezing")
//    } else if (temp <= 14) { // handles 0..14
//        println("Cold")
//    } else if (temp <= 24) { // handles 15..24
//        println("Mild")
//    } else {
//        println("Warm")
//    }
//}


// // Task3
//fun main() {
//    print("Enter age: ")
//    val age = readln().toInt()
//
//    print("Do you have a ticket? (yes/no): ")
//    val ticketAnswer = readln().trim().lowercase()
//    val hasTicket = (ticketAnswer == "yes")
//
//    // Check age first, then ticket status
//    if (age < 12) {
//        println("Too young")
//    } else if (!hasTicket) {
//        println("Need a ticket")
//    } else {
//        println("Enter")
//    }
//}


// // Task4
//fun main() {
//    print("Enter age: ")
//    val age = readln().toInt()
//
//    // Using || to check for child or senior
//    if (age < 13 || age > 65) {
//        println("Discount")
//    } else {
//        println("Regular")
//    }
//}


// // Task5
//fun main() {
//    print("Enter integer a: ")
//    val a = readln().toInt()
//
//    print("Enter integer b: ")
//    val b = readln().toInt()
//
//    // Using if as an expression to assign max directly
//    val max = if (a > b) a else b
//
//    println("max = $max")
//}


// // Task6
//fun main() {
//    print("Enter score (0–100): ")
//    val score = readln().toInt()
//
//    val grade = when (score) {
//        in 90..100 -> 'A'
//        in 80..89  -> 'B'
//        in 70..79  -> 'C'
//        in 60..69  -> 'D'
//        else       -> 'F'
//    }
//
//    println("Grade: $grade")
//}


// // Task7
//fun main() {
//    print("Enter integer n: ")
//    val n = readln().toInt()
//
//    val label = when {
//        n < 0 -> "negative"
//        n == 0 -> "zero"
//        n % 2 == 0 -> "positive even"
//        else -> "positive odd"
//    }
//
//    println(label)
//}


// // Task8
//fun main() {
//    print("Enter first integer: ")
//    var a = readln().toInt()
//    print("Enter second integer: ")
//    var b = readln().toInt()
//    print("Enter third integer: ")
//    var c = readln().toInt()
//
//    // Simple comparison sorting (bubble-sort style for 3 values)
//    if (a > b) { val temp = a; a = b; b = temp }
//    if (b > c) { val temp = b; b = c; c = temp }
//    if (a > b) { val temp = a; a = b; b = temp }
//
//    println("$a $b $c")
//}
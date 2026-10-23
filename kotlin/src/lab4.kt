//// Task1
//fun main() {
//    val nums = listOf(4, 8, 15, 16, 23)
//
//    println("first = ${nums[0]}")
//    println("last = ${nums[nums.size - 1]}")
//    println("size = ${nums.size}")
//}


//// Task2
//fun main() {
//    val items = mutableListOf("milk", "bread")
//
//    print("Enter another item to add: ")
//    items.add(readln())
//
//    // Change index 0 to "oat milk"
//    items[0] = "oat milk"
//
//    println("List: $items")
//    println("Size: ${items.size}")
//}


//// Task3
//fun main() {
//    print("Enter positive integer n: ")
//    val n = readln().toInt()
//
//    repeat(n) {
//        print("*")
//    }
//    println()
//}


//// Task4
//fun main() {
//    print("Enter n: ")
//    var n = readln().toInt()
//
//    while (n > 0) {
//        println(n)
//        n--
//    }
//    println("Go!")
//}


//// Task5
//fun main() {
//    val xs = listOf(2, 1, 7, 4)
//
//    var sumA = 0
//    for (x in xs) {
//        sumA += x
//    }
//
//    var sumB = 0
//    for (i in 0 until xs.size) {
//        sumB += xs[i]
//    }
//
//    println("Sum A: $sumA")
//    println("Sum B: $sumB")
//}


//// Task6
//fun main() {
//    for (i in 1..5) {
//        print("$i ")
//    }
//    println()
//
//    for (i in 5 downTo 1) {
//        print("$i ")
//    }
//    println()
//
//    for (i in 0 until 3) {
//        print("$i ")
//    }
//    println()
//
//    for (i in 1..9 step 2) {
//        print("$i ")
//    }
//    println()
//}


//// Task7
//fun main() {
//    print("Enter age: ")
//    val age = readln().toInt()
//
//    if (age in 13..19) {
//        println("Teen")
//    } else {
//        println("Not a teen")
//    }
//}


//// Task8
//fun main() {
//    var choice: Int
//    do {
//        println("\n1) Hello")
//        println("2) Quit")
//        print("Enter your choice: ")
//        choice = readln().toInt()
//
//        when (choice) {
//            1 -> println("Hello!")
//            2 -> println("Quitting...")
//            else -> println("Unknown")
//        }
//    } while (choice != 2)
//}


//// Task9
//fun main() {
//    print("Enter numbers: ")
//    val line = readln()
//
//    val pieces = line.split(" ")
//    var sum = 0
//
//    for (p in pieces) {
//        if (p.isNotBlank()) {
//            sum += p.toInt()
//        }
//    }
//
//    println("Sum = $sum")
//}


//// Task10
//fun main() {
//    print("Enter names separated by commas: ")
//    val input = readln()
//
//    // Split by comma and clean up any surrounding whitespace
//    val names = input.split(",").map { it.trim() }
//
//    for (i in names.indices) {
//        println("$i: ${names[i]}")
//    }
//}
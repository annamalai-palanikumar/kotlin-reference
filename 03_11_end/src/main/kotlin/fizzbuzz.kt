fun main(args: Array<String>) {
    println("Fizz Buzz")

    // Create a loop to display the numbers 1 to 105
    // after the number
    //  print "fizz" if the number is divisible by 3
    //  print "buzz" if the number is divisible by 5
    //  print "fizz buzz" if the number is divisible by 3 and 5

    // Add your solution here

    for (index in 1..105) {
        print("$index ")
        when {
            index % 15 == 0 -> print("fizz buzz")
            index % 3 == 0 -> print("fizz")
            index % 5 == 0 -> print("buzz")
        }
        println();
    }
}

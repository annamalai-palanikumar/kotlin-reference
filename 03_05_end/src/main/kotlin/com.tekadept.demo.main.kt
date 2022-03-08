
fun main(args: Array<String>) {
    println("Hello, World")

    val aSentence = "I'm a string"
    val myPi = 3.14
    val myAnswer = 42

    var aString: String
    val aDouble: Double
    val aInt: Int

    var myDouble = 1.999
    var myFloat = 1.9F
    var myLong = 123123122L
    var myInt = 199
    var myShort: Short = 12
    var myByte: Byte = 127

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    val anInt: Int = 1
    val aLong: Long = anInt.toLong()


// int lowest = (a < b) ? a : b;

    val lowest = if( myInt < anInt) myInt else anInt;
    println("The lowest value is $lowest")

    val temp = 80
    val isAirConditionerOn = if(temp >= 80){
        println("It is warm")
        true;
    } else {
        println("It is not so warm")
        false;
    }
    println("Is the air conditioner on: $isAirConditionerOn")

    val burgersOrdered = 8

    when(burgersOrdered){
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure?")
        }
    }

    when(burgersOrdered) {
        Math.abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when(burgersOrdered){
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }
}


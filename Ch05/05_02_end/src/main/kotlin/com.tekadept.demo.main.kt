package com.tekadept.demo

object MySingleton {
    var temperatures = arrayOf(80, 76, 90)
    fun getLastTemperature() = temperatures.last()
}

fun JavaInterop() {
    val Frisky = Animal("Frisky", "cat", 10)
    println(Frisky.Show())
    val Fido = Animal("Fido", "dog", 30)
    println(Fido.Show())

    Frisky.weight = 15
    println(Frisky.Show())

    //Frisky.kind = "puma"
}

fun main(args: Array<String>) {
    println("Hello, World")

    JavaInterop()
    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123456789L, 999999999999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta", "Alpha")
    
    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte") 
    println("The max String = $maxString")
    
    val me = Person("Troy", "Miles")
    val you = Person("Janet", "Chung", "Yang")

    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun printIt() {
            println("Position = ($xPosition, $yPosition)")
        }
    }
    location.printIt()
    location.xPosition = 2000
    location.yPosition = 4000
    location.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last reading = $temperature degrees")

    val myCar = Car()
    myCar.go()
    println("My car's make = ${myCar.MakeName}")
    return

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
    var x = 0

    while(x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    for(item in 1..10){
        //item++
        print("$item, ")
    }

    for(ch in "biscuit") {
        println(ch)
    }

    println();
    var ndx = 0
    for(item in 10.rangeTo(20).step(2)){
        print("${++ndx}) $item, ")
    }
    println();

    for((index, item) in 10.rangeTo(20).step(2).withIndex()){
        print("${index + 1}) $item, ")
    }
    println();

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()

    println("10 + 20 = ${myFunction2(10, 20)}")

    myDefaults(10, 20, "Hello")

    myDefaults(message = "Greetings")
}

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun myFunction1(param1: Int, param2: Int): Int = param1 + param2

fun myFunction2(param1: Int, param2: Int) = param1 + param2

fun myDefaults(param1: Int = 1, param2: Int = 5, message: String = "Hi"): Int {
    val results = param1 + param2
    println(message)
    return results
}

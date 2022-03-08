
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

}


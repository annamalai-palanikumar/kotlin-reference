package com.tekadept.demo

class Person internal constructor(var firstName: String, var lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName:String, middleName: String):
            this(firstName, lastName) {

    }
}
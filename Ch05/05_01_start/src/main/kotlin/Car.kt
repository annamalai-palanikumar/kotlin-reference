package com.tekadept.demo

class Car : Vehicle {
    override val MakeName = "Ford"
    override fun getDoors(): Int {
        return 5
    }
}
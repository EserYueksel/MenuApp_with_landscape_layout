package com.example.speisekarteapp

class Drink(val name: String, val price: Float){

    private var capacity = 50

    var count: Int = 0
        set(value) {
            if (value <= capacity) {
                field = value
            } else {
                throw Exception("Soviel $name ist nicht da")
            }
        }
}

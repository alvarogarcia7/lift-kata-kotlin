package com.example.kata.lift

class Buttons(val lift: Lift) {
    fun select(floor: Int) {
        lift.goTo(floor)
    }

}

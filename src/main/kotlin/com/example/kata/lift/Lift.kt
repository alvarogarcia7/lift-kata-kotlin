package com.example.kata.lift

class Lift(val at: Int, val goingTo: Direction) {

    fun calledFrom(floor: Int, direction: Direction): Lift {
        return Lift(floor, direction)
    }

}

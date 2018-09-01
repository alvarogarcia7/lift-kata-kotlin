package com.example.kata.lift

class Lift(val at: Int, val goingTo: Direction) {

    private val queuedCalls = mutableListOf<Call>()

    fun calledFrom(floor: Int, direction: Direction): Lift {
        if (this.goingTo == Direction.STOPPED || direction == this.goingTo) {
            return Lift(floor, direction)
        } else {
            queuedCalls.add(Call(floor, direction))
            return this
        }
    }

    data class Call(val floor: Int, val direction: Direction)

}

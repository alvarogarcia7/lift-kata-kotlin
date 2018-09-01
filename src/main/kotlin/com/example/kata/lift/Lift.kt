package com.example.kata.lift

class Lift(val at: Int, val goingTo: Direction) {

    private val queuedCalls = mutableListOf<Call>()

    fun calledFrom(floor: Int, direction: Direction): Lift {
        return if (goingTowards(direction)) {
            Lift(floor, direction)
        } else {
            queuedCalls.add(Call(floor, direction))
            this
        }
    }

    private fun goingTowards(direction: Direction) =
            this.goingTo == Direction.STOPPED || direction == this.goingTo

    data class Call(val floor: Int, val direction: Direction)

}

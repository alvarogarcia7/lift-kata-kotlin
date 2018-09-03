package com.example.kata.lift

import java.util.*

class Lift(val floor: Int) {
    var nextStop: Optional<Int> = Optional.empty()

    fun callFrom(source: Int, direction: Direction): Lift {
        if (!nextStop.isPresent) {
            this.nextStop = Optional.of(source)
        }
        return this
    }

    fun nextStop(): Optional<Int> {
        return this.nextStop
    }
}

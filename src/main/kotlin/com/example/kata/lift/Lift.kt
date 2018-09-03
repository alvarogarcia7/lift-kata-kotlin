package com.example.kata.lift

import java.util.*

class Lift(var floor: Int) {
    var nextStop: Optional<Int> = Optional.empty()

    fun callFrom(source: Int, direction: Direction): Promise<Buttons> {
        if (!nextStop.isPresent) {
            this.nextStop = Optional.of(source)
        }
        val promise = Promise<Buttons>()
        promise.complete(Buttons(this))
        return promise
    }

    fun nextStop(): Optional<Int> {
        return this.nextStop
    }

    fun goTo(floor: Int) {
        this.floor = floor
        this.nextStop = Optional.empty()
    }
}

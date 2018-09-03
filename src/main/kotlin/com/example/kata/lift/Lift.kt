package com.example.kata.lift

import java.util.*

class Lift(var floor: Int) {
    var nextStop: Optional<Int> = Optional.empty()

    fun callFrom(source: Int, direction: Direction): Promise<Buttons> {
        if (!nextStop.isPresent) {
            this.nextStop = Optional.of(source)
        }
        val completableFuture = Promise<Buttons>()
        completableFuture.complete(Buttons(this))
        return completableFuture
    }

    fun nextStop(): Optional<Int> {
        return this.nextStop
    }

    fun goTo(floor: Int) {
        this.floor = floor
    }
}

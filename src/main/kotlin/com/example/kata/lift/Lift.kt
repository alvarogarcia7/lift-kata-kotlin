package com.example.kata.lift

class Lift(val floor: Int) {
    var nextStop: Int = 0

    fun callFrom(source: Int, direction: Direction): Lift {
        this.nextStop = source
        return this
    }

    fun nextStop(): Int {
        return this.nextStop
    }
}

package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

class LiftAcceptanceTest {

    @Test
    fun `has attribute floor which indicates current location`() {
        var lift = Lift(0)

        assertThat(lift.floor).isEqualTo(0)
    }

    @Test
    fun `responds to calls containing a source floor and direction`() {
        var lift = Lift(0)

        lift = lift.callFrom(2, Direction.UP)

        assertThat(lift.nextStop()).isEqualTo(Optional.of(2))
    }

    @Test
    fun `do not queue call when the lift is busy`() {
        var lift = Lift(0)

        lift = lift.callFrom(2, Direction.UP)
        lift = lift.callFrom(3, Direction.UP)

        assertThat(lift.nextStop()).isEqualTo(Optional.of(2))
    }
}
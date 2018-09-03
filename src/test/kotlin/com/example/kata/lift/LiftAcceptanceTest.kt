package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

class LiftAcceptanceTest {

    @Test
    fun `has attribute floor which indicates current location`() {
        val lift = Lift(0)

        assertThat(lift.floor).isEqualTo(0)
    }

    @Test
    fun `responds to calls containing a source floor and direction`() {
        val lift = Lift(0)

        lift.callFrom(2, Direction.UP)

        assertThat(lift.nextStop()).isEqualTo(Optional.of(2))
    }

    @Test
    fun `queue call when the lift is busy`() {
        val lift = Lift(0)

        val promise1 = lift.callFrom(2, Direction.UP)
        assertThat(lift.nextStop()).isEqualTo(Optional.of(2))
        promise1.then { it.select(3) }
        val promise2 = lift.callFrom(4, Direction.UP)
        assertThat(lift.nextStop()).isEqualTo(Optional.of(4))
        promise2.then { it.select(5) }
        assertThat(lift.nextStop()).isEqualTo(Optional.empty<Int>())
    }

    @Test
    fun `deliver passengers to their destination`() {
        val lift = Lift(0)

        val buttons: Promise<Buttons> = lift.callFrom(2, Direction.UP)
        buttons.then {
            it.select(3)
        }

        assertThat(lift.floor).isEqualTo(3)
    }
}
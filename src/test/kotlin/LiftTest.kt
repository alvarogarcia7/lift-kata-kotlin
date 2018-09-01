package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LiftTest {
    @Test
    fun moves_when_called() {
        var lift = Lift(0, Direction.STOPPED)
        assertThat(lift.at).isEqualTo(0)
        assertThat(lift.goingTo).isEqualTo(Direction.STOPPED)

        lift = lift.calledFrom(2, Direction.UP)

        assertThat(lift.at).isEqualTo(2)
        assertThat(lift.goingTo).isEqualTo(Direction.UP)
    }
}
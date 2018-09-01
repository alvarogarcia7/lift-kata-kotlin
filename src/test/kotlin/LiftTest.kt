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

    @Test
    fun queues_calls_when_not_going_the_same_direction() {
        var lift = Lift(0, Direction.STOPPED)

        lift = lift.calledFrom(2, Direction.UP)
        lift = lift.calledFrom(2, Direction.DOWN)

        assertThat(lift.at).isEqualTo(2)
        assertThat(lift.goingTo).isEqualTo(Direction.UP)
    }
}
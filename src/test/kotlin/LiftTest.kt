package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LiftTest {
    @Test
    fun moves_when_called() {
        var lift = Lift()
        assertThat(lift.at).equalsTo(0)

        lift.calledFrom(2, UP)

        assertThat(lift.at).equalsTo(2)
        assertThat(lift.goingTo).equalsTo(UP)
    }
}
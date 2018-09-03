package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LiftUnitTest {

    @Test
    fun `can be at any floor`() {
        var lift = Lift(0)

        assertThat(lift.floor).isEqualTo(0)
    }

    @Test
    fun `can be at any other floor`() {
        var lift = Lift(25)

        assertThat(lift.floor).isEqualTo(25)
    }

}
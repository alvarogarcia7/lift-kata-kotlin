package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LiftAcceptanceTest {

    @Test
    fun `has attribute floor which indicates current location`() {
        var lift = Lift(0)

        assertThat(lift.floor).isEqualTo(0)
    }
}
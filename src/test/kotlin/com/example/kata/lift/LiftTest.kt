package com.example.kata.lift

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LiftTest {

    @Test
    fun `has attribute floor which indicates current location`() {
        var lift = Lift()

        assertThat(lift.floor).isEqualTo(0)
    }
}
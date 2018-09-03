package com.example.kata.lift

import java.util.*

class Promise<T> {
    private var value: Optional<T> = Optional.empty()

    fun complete(value: T) {
        this.value = Optional.of(value)
    }

    fun <R> then(mapper: (T) -> R): Optional<R> {
        return value.map { mapper.invoke(it) }
    }

}

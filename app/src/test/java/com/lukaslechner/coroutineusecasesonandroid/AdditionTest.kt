package com.lukaslechner.coroutineusecasesonandroid

import org.junit.Test

class AdditionTest {

    private val SUT = Addition()

    @Test
    fun `test new`() {
        assert(SUT.new() == 0)
    }
}
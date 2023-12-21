package com.example.unityapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val str = "yoyo"
        assertEquals(str.quoted(), "'yoyo'")
        assertTrue(str.isShort())
    }

    private fun String.quoted() = "'${this}'"
    private fun String.isShort() = this.length < 5


}
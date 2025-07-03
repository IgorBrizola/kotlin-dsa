package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SlidingWindowTest {

    private val slidingWindowUseCase = SlidingWindow()
    @Test
    fun `should return a maximum Length Substring With Two Occurrences`() {
        val s = "bcbbbcba"

        val result = slidingWindowUseCase.slidingWindow(s)

        val expectedOutput = 4

        kotlin.test.assertEquals(expectedOutput, result)
    }
}
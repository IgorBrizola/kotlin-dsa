package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReversedStringTest {
    private val reversedStringUseCase = ReversedString()

    @Test
    fun `should return the string reversed, case one`() {
        val s = charArrayOf('h','e','l','l','o',)

        val expectedSReversed = charArrayOf('o','l','l','e','h',)

        val result = reversedStringUseCase.reverseString(s)

        assertArrayEquals(expectedSReversed, result)
    }

    @Test
    fun `should return the string reversed, case two`() {
        val s = charArrayOf('H','a','n','n','a','h')

        val expectedSReversed = charArrayOf('h','a','n','n','a','H')

        val result = reversedStringUseCase.reverseString(s)

        assertArrayEquals(expectedSReversed, result)
    }
}
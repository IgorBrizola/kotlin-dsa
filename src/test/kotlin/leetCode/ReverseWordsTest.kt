package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseWordsTest {
    private val reverseWordsUseCase = ReverseWords()

    @Test
    fun `should return the words of string reversed, case one`(){

        val s = "Mr Ding"

        val result = reverseWordsUseCase.reverseWords(s)

        val expected = "rM gniD"

        assertEquals(expected, result)
    }

    @Test
    fun `should return the words of string reversed, case two`(){

        val s = "Let's take LeetCode contest"

        val result = reverseWordsUseCase.reverseWords(s)

        val expected = "s'teL ekat edoCteeL tsetnoc"

        assertEquals(expected, result)
    }
}
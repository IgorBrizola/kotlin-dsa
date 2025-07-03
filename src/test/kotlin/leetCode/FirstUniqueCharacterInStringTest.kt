package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FirstUniqueCharacterInStringTest{
    private val firstUniqueCharacterUseCase = FirstUniqueCharacterInString()

    @Test
    fun `First Unique Character in a String using alphabet, case index`() {
        val s = "leetCode"

        val result = firstUniqueCharacterUseCase.findUniqueCharacterWithAlphabet(s)

        val expectedIndex = 0

        assertEquals(expectedIndex, result)
    }


    @Test
    fun `First Unique Character in a String using alphabet, case -1`() {
        val s = "aabb"

        val result = firstUniqueCharacterUseCase.findUniqueCharacterWithAlphabet(s)

        val expectedIndex = -1

        assertEquals(expectedIndex, result)
    }


    @Test
    fun `First Unique Character in a String using hashmap, case index`() {
        val s = "leetCode"

        val result = firstUniqueCharacterUseCase.findUniqueCharacterWithHashMap(s)

        val expectedIndex = 0

        assertEquals(expectedIndex, result)
    }


    @Test
    fun `First Unique Character in a String using hashmap, case -1`() {
        val s = "aabb"

        val result = firstUniqueCharacterUseCase.findUniqueCharacterWithHashMap(s)

        val expectedIndex = -1

        assertEquals(expectedIndex, result)
    }

}
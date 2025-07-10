package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoPointerTest {
    private val twoPointerUseCase = TwoPointer()


    @Test
    fun`should return index of the target`() {
        val target = 6
        val expectedIndex = 5

        val arr = (1..10).toList().toIntArray()

        val result = twoPointerUseCase.twoPointers(arr, target)

        assertEquals(expectedIndex, result)

    }
}
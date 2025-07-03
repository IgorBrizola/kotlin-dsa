package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BubbleSortTest {
    private val bubbleSortUseCase = BubbleSort()



    @Test
    fun `should return array sorted`() {
        val arrayUnsorted = intArrayOf(8, 4, 7, 3, 5, 6, 2)

        val result = bubbleSortUseCase.bubbleSort(arrayUnsorted)

        val expected = intArrayOf(2, 3, 4, 5, 6, 7, 8)

        assertArrayEquals(expected, result)
    }
}
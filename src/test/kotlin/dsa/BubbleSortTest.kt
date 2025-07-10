package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BubbleSortTest {
    private val bubbleSortUseCase = BubbleSort()

    // O(N^2)
    @Test
    fun `should return array sorted, worst case`() {
        val arrayUnsorted = intArrayOf(5,4,3,2,1,0)

        val result = bubbleSortUseCase.bubbleSort(arrayUnsorted)

        val expected = intArrayOf(0,1,2,3,4,5)

        assertArrayEquals(expected, result)
    }

    // O(N)
    @Test
    fun `should return array sorted, best case`() {
        val arrayUnsorted = intArrayOf(0,1,2,3,4,5)

        val result = bubbleSortUseCase.bubbleSort(arrayUnsorted)

        val expected = intArrayOf(0,1,2,3,4,5)

        assertArrayEquals(expected, result)
    }
}
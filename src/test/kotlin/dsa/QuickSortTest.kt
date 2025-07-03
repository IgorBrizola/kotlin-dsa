package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QuickSortTest{
    private val quickSortUseCase = QuickSort()


    @Test
    fun `should return array sorted with complexity n log n`() {
        val arrayUnsorted = intArrayOf(8, 4, 7, 3, 5, 6, 2)

        quickSortUseCase.quickSort(arrayUnsorted, 0, arrayUnsorted.size - 1)

        val expected = intArrayOf(2, 3, 4, 5, 6, 7, 8)

        assertArrayEquals(expected, arrayUnsorted)
    }
}
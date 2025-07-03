package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest {
    private val binarySearchUSeCase = BinarySearch()

    @Test
    fun `Binary Search`() {
        val nums = intArrayOf(-1,0,3,5,9,12)

        val target = 9

        val result = binarySearchUSeCase.binarySearch(nums, target)

        val expectedIndex = 4

        assertEquals(expectedIndex, result)
    }

    @Test
    fun `Binary Search error -1`() {
        val nums = intArrayOf(-1,0,3,5,9,12)

        val target = 2

        val result = binarySearchUSeCase.binarySearch(nums, target)

        val expectedIndex = -1

        assertEquals(expectedIndex, result)
    }

}
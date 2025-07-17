package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest{
    private val binarySearchUseCase = BinarySearch()


    @Test
    fun `binary search index - array size 10`() {
        val arr = (1..10).toList().toIntArray()
        val target = 3

        val result = binarySearchUseCase.binarySearch(arr, target)

        val expectedSteps = 2
        assertEquals(expectedSteps, result)
    }

    @Test
    fun `binary search index - array size 20`() {
        val arr = (1..20).toList().toIntArray()
        val target = 15

        val result = binarySearchUseCase.binarySearch(arr, target)

        val expectedSteps = 14
        assertEquals(expectedSteps, result)
    }


    @Test
    fun `binary search index - array size 40`() {
        val arr = (1..40).toList().toIntArray()
        val target = 28

        val result = binarySearchUseCase.binarySearch(arr, target)

        val expectedSteps = 27
        assertEquals(expectedSteps, result)
    }

    @Test
    fun `binary search index - array size 80`() {
        val arr = (1..80).toList().toIntArray()
        val target = 77

        val result = binarySearchUseCase.binarySearch(arr, target)

        val expectedSteps = 76
        assertEquals(expectedSteps, result)
    }

    @Test
    fun`should return index of the target game`() {
        val target = 70
        val expectedIndex = 69

        val arr = (1..1000).toList().toIntArray()

        val result = binarySearchUseCase.binarySearch(arr, target)

        assertEquals(expectedIndex, result)
    }
}
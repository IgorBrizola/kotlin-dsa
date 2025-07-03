package dsa

import org.junit.jupiter.api.Test

class ExponentialSearchTest{
    private val exponentialSearch = ExponentialSearch(
        binarySearchUseCase = BinarySearch()
    )

    @Test
    fun `exponential search index - array size 20`() {
        val arr = (1..20).toList().toIntArray()
        val target = 10

        val result = exponentialSearch.exponentialSearch(arr, target)

        val expectedIndex = 9
        kotlin.test.assertEquals(expectedIndex, result)
    }
}
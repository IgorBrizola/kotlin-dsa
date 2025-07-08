package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumIITest {
    private val twoSumIIUseCase = TwoSumII()


    @Test
    fun `should return the two index, case one`() {
        val arr = intArrayOf(2,7,11,15)
        val target = 9

        val indexExpected = intArrayOf(1,2)

        val result = twoSumIIUseCase.twoSumII(arr, target)

        assertArrayEquals(indexExpected, result)
    }

    @Test
    fun `should return the two index, case two`() {
        val arr = intArrayOf(2,3,4)
        val target = 6

        val indexExpected = intArrayOf(1,3)

        val result = twoSumIIUseCase.twoSumII(arr, target)

        assertArrayEquals(indexExpected, result)
    }

    @Test
    fun `should return the two index, case three`() {
        val arr = intArrayOf(0,0,3,4)
        val target = 0

        val indexExpected = intArrayOf(1,2)

        val result = twoSumIIUseCase.twoSumII(arr, target)

        assertArrayEquals(indexExpected, result)
    }
}
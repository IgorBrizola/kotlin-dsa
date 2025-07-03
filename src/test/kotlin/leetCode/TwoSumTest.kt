package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumTest {
    private val twoSumUseCase = TwoSum()


    @Test
    fun `scenery one should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(10, 20, 22, 30,2, 5, 7, 15)
        val target = 29

        val expected = intArrayOf(2, 6)

        val result = twoSumUseCase.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery two should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(2,10,5,3)
        val target = 13

        val expected = intArrayOf(1,3)

        val result = twoSumUseCase.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery three should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(4,3,1,10,17, 7)
        val target = 17

        val expected = intArrayOf(3, 5)

        val result = twoSumUseCase.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery one should return the indices of two number where the result is target with array sorted`() {
        val nums = intArrayOf(2, 5, 7, 15)
        val target = 9

        val expected = intArrayOf(0,2)

        val result = twoSumUseCase.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery two should return the indices of two number where the result is target with array sorted`() {
        val nums = intArrayOf(2,3,5,10)
        val target = 13

        val expected = intArrayOf(1,3)

        val result = twoSumUseCase.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery three should return the indices of two number where the result is target  with array sorted`() {
        val nums = intArrayOf(2,3,4)
        val target = 7

        val expected = intArrayOf(1,2)

        val result = twoSumUseCase.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

}
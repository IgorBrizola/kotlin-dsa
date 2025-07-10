package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HashMapTest{
    private val hashMapUseCase = HashMap()

    @Test
    fun `should return the indices of two numbers where the result is equal to the target, test one`() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val expected = intArrayOf(0, 1)

        val result = hashMapUseCase.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the indices of two numbers where the result is equal to the target, test two`() {
        val nums = intArrayOf(3,2,4)
        val target = 6

        val expected = intArrayOf(1,2)

        val result = hashMapUseCase.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the indices of two numbers where the result is equal to the target, test three`() {
        val nums = intArrayOf(3,3)
        val target = 6

        val expected = intArrayOf(0,1)

        val result = hashMapUseCase.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }

}
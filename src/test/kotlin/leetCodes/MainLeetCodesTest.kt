package leetCodes

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class MainLeetCodesTest {

    private val leetCodes = SolutionsLeetCodes()

    @Test
    fun `should return a longest palindromic string`() {
        val str = "cbbd"
        val expected = "bb"

        val result = leetCodes.longestPalindrome(str)

        assertEquals(expected, result)
    }

    @Test
    fun `scenery one should return the indices of two number where the result is target`() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val expected = intArrayOf(0,1)

        val result = leetCodes.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery two should return the indices of two number where the result is target`() {
        val nums = intArrayOf(3,2,3)
        val target = 6

        val expected = intArrayOf(0,2)

        val result = leetCodes.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery three should return the indices of two number where the result is target`() {
        val nums = intArrayOf(3,3)
        val target = 6

        val expected = intArrayOf(0,1)

        val result = leetCodes.twoSum(nums, target)

        assertArrayEquals(expected, result)
    }
}
package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SlidingWindowTest {

    private val slidingWindowUseCase = SlidingWindow()
    @Test
    fun `should return a maximum Length Substring With Two Occurrences`() {
        val s = "bcbbbcba"

        val result = slidingWindowUseCase.slidingWindow(s)

        val expectedOutput = 4

        kotlin.test.assertEquals(expectedOutput, result)
    }



    @Test
    fun `Contains Duplicate II, should return true, case one`(){
        val nums = intArrayOf(1,2,1)
        val k = 0

        val result = slidingWindowUseCase.containsNearbyDuplicate(nums, k)

        assertFalse { result }
    }

    @Test
    fun `Contains Duplicate II, should return false, case two`(){
        val nums = intArrayOf(1,2,3,1,2,3)
        val k = 2

        val result = slidingWindowUseCase.containsNearbyDuplicate(nums, k)

        assertFalse { result }
    }

    @Test
    fun `Contains Duplicate II, should return false, case three`(){
        val nums = intArrayOf(1,2,3,1)
        val k = 3

        val result = slidingWindowUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }

    @Test
    fun `Contains Duplicate II, should return true case four`(){
        val nums = intArrayOf(0,1,2,3,2,5)
        val k = 3

        val result = slidingWindowUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }

    @Test
    fun `Contains Duplicate II, should return true case five`(){
        val nums = intArrayOf(1,0,1,1)
        val k = 1

        val result = slidingWindowUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }
}
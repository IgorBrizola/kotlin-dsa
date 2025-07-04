package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ContainsNearbyDuplicateTest {
    private val containsNearbyDuplicateUseCase = ContainsNearbyDuplicate()
    @Test
    fun `Contains Duplicate II, should return true, case one`(){
        val nums = intArrayOf(1,2,1)
        val k = 0

        val result = containsNearbyDuplicateUseCase.containsNearbyDuplicate(nums, k)

        assertFalse { result }
    }

    @Test
    fun `Contains Duplicate II, should return false, case two`(){
        val nums = intArrayOf(1,2,3,1,2,3)
        val k = 2

        val result = containsNearbyDuplicateUseCase.containsNearbyDuplicate(nums, k)

        assertFalse { result }
    }

    @Test
    fun `Contains Duplicate II, should return false, case three`(){
        val nums = intArrayOf(1,2,3,1)
        val k = 3

        val result = containsNearbyDuplicateUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }

    @Test
    fun `Contains Duplicate II, should return true case four`(){
        val nums = intArrayOf(0,1,2,3,2,5)
        val k = 3

        val result = containsNearbyDuplicateUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }

    @Test
    fun `Contains Duplicate II, should return true case five`(){
        val nums = intArrayOf(1,0,1,1)
        val k = 1

        val result = containsNearbyDuplicateUseCase.containsNearbyDuplicate(nums, k)

        assertTrue { result }
    }
}
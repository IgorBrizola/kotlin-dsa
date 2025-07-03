package leetCode

import org.slf4j.LoggerFactory
import java.util.LinkedList

private val log = LoggerFactory.getLogger(TwoSum::class.java)

class TwoSum {
    fun twoSumSorted(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1

        val numsMap = hashMapOf<Int, Int>()

        while (left <= right) {
            val complementLeft = target - nums[left]

            if (numsMap.containsKey(complementLeft)) return intArrayOf(left, numsMap[complementLeft]!!)

            numsMap[nums[left]] = left
            left++

            val complementRight = target - nums[right]

            if (numsMap.containsKey(complementRight)) return intArrayOf(numsMap[complementRight]!! , right)

            numsMap[nums[right]] = right
            right--
        }
        return intArrayOf(0)
    }

    fun twoSumUnsorted(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {

            val complement = target - num

            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, index)
            }

            map[num] = index
        }
        throw IllegalArgumentException("No valid solution found.")
    }
}
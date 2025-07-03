package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(TwoSum::class.java)

class TwoSum {
    fun twoSumSorted(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        var targetIndex = intArrayOf()

        for (i in 0 until numbers.size - 1) {
            if (numbers[left] + numbers[right] == target) {
                targetIndex = intArrayOf(left, right)
            } else if (numbers[left] + numbers[right] < target) {
                left++
            } else if (numbers[left] + numbers[right] > target) {
                right--
            } else {
                throw IllegalArgumentException("No valid solution found.")
            }
        }

        return targetIndex
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
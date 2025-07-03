package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(BinarySearch::class.java)

class BinarySearch {
    fun binarySearch(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size -1

        while (left < right) {
            val mid = ((right + left) / 2)

            if (nums[mid] == target) return mid
            if (nums[mid] > target) right = mid
            if (nums[mid] < target) {
                left = mid + 1
            }
        }

        return -1
    }
}
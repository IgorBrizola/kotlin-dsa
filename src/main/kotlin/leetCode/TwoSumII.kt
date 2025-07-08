package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(TwoSumII::class.java)

class TwoSumII {
    fun twoSumII(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size -1

        while (left <= right) {
            if (numbers[left] + numbers[right] == target) return intArrayOf(left + 1, right + 1)
            if (numbers[left] + numbers[right] > target) right--
            if (numbers[left] + numbers[right] < target) left++
        }

        return intArrayOf(-1)
    }
}
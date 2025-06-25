package leetCodes

import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger(SolutionsLeetCodes::class.java)

class SolutionsLeetCodes {
    fun longestPalindrome(s: String): String {
        if (s.length < 2) return s

        var start = 0
        var end = 0

        fun expandAroundCenter(left: Int, right: Int): Pair<Int, Int> {
            var l = left
            var r = right
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                l--
                r++
            }
            return Pair(l + 1, r - 1)
        }

        for (i in s.indices) {
            val (l1, r1) = expandAroundCenter(i, i)
            val (l2, r2) = expandAroundCenter(i, i + 1)

            if (r1 - l1 > end - start) {
                start = l1
                end = r1
            }
            if (r2 - l2 > end - start) {
                start = l2
                end = r2
            }
        }

        return s.substring(start, end + 1)
    }

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        val numbersSorted = numbers.sorted()

        var targetIndex = intArrayOf()

        for (i in 0 until numbersSorted.size - 1) {
            if (numbersSorted[left] + numbersSorted[right] == target) {
                targetIndex = intArrayOf(left, right)
            } else if (numbersSorted[left] + numbersSorted[right] < target) {
                left++
            } else if (numbersSorted[left] + numbersSorted[right] > target) {
                right--
            } else {
                throw IllegalArgumentException("Target not found!")
            }
        }

        return targetIndex
    }
}


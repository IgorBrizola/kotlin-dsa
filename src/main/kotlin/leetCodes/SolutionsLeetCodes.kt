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

    fun twoSum(nums: IntArray, target: Int): IntArray {
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

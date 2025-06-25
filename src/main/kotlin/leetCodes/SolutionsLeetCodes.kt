package leetCodes

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(SolutionsLeetCodes::class.java)

class SolutionsLeetCodes {
    // PALINDROMIC STRING
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

    // TWO SUM WITH SORTED = TARGET -> O(n)
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

    // TWO SUM WITHOUT SORTED = TARGET -> O(n^2)
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

    fun climbStairs(n: Int): Int {
        return 1
    }

    // SEQUENCE FIBONACCI -> O(n)
    fun fibonacciSequence(num: Int): IntArray {
        val sequence: MutableList<Int> = mutableListOf(0, 1, 1) // f0, f1, f2
        val f3 = 3

        for (i in f3..num) {
            val nextNumberSequence = calculateNextNumberOfSequence(sequence, i)
            sequence.add(nextNumberSequence)
        }

        log.info("sequence fibonacci is -> $sequence")

        return sequence.toIntArray()
    }

    private fun calculateNextNumberOfSequence(currentSequence: List<Int>, fibonacciPosition: Int): Int
    = ((currentSequence[fibonacciPosition - 1]) + ((currentSequence[fibonacciPosition - 2])))


}


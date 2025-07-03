package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(ClimbStairs::class.java)

class ClimbStairs {
    fun climbStairs(n: Int): Int {
        if (n <= 3) return n

        var fPrevious = 1
        var fNext = 1

        val f3 = 2

        for (i in f3..n) {
            val temp = fPrevious + fNext
            fPrevious = fNext
            fNext = temp
        }

        return fNext
    }
}
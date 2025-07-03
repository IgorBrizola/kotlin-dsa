package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(FibonacciNumber::class.java)

class FibonacciNumber {
    fun fib(n: Int): Int {
        if (n < 2) return n

        var f1 = 0
        var f2 = 1

        for (i in 2..n) {
            val temp = f1 + f2
            f1 = f2
            f2 = temp
        }

        return f2
    }
}
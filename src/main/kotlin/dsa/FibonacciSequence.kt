package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(FibonacciSequence::class.java)

class FibonacciSequence {
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
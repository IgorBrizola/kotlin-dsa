package dsa

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FibonacciSequenceTest {

    private val fibonacciSequenceUseCase = FibonacciSequence()

    @Test
    fun `should return a sequence of fibonacci`(){
        val n = 19

        val result = fibonacciSequenceUseCase.fibonacciSequence(n)

        val expected = intArrayOf(0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181)

        assertArrayEquals(expected, result)
    }
}
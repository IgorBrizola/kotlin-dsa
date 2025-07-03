package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FibonacciNumberTest{
    private val fibonacciNumberUseCase = FibonacciNumber()


    @Test
    fun `should return fibonacci f(n)`() {
        val n = 2

        val result = fibonacciNumberUseCase.fib(n)

        val expected = 1

        assertEquals(expected, result)
    }

    @Test
    fun `should return fibonacci f(n), case two`() {
        val n = 4

        val result = fibonacciNumberUseCase.fib(n)

        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun `should return fibonacci f(n), case three`() {
        val n = 8

        val result = fibonacciNumberUseCase.fib(n)

        val expected = 21

        assertEquals(expected, result)
    }
}
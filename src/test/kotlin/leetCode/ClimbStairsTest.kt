package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ClimbStairsTest {

    private val climbStairsUseCase = ClimbStairs()

    @Test
    fun `should return steps for climb to top, case one`(){
        val stairs = 3

        val result = climbStairsUseCase.climbStairs(stairs)

        val expected = 3

        assertEquals(expected, result)
    }


    @Test
    fun `should return steps for climb to top, case two`(){
        val stairs = 2

        val result = climbStairsUseCase.climbStairs(stairs)

        val expected = 2

        assertEquals(expected, result)
    }


    @Test
    fun `should return steps for climb to top, case three`(){
        val stairs = 6

        val result = climbStairsUseCase.climbStairs(stairs)

        val expected = 13

        assertEquals(expected, result)
    }
}
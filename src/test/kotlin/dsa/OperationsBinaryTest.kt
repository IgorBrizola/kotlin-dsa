package dsa

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OperationsBinaryTest {
    private val operationsBinary = OperationsBinary()



    @Test
    fun `should return true if x is odd`(){
        val x = 5

        val result = operationsBinary.isOdd(x)

        assertTrue { result }
    }

    @Test
    fun `should return true if x is even`(){
        val x = 10

        val result = operationsBinary.isEven(x)

        assertTrue { result }
    }

    @Test
    fun `should return the number that missing in array`() {
        val arr = intArrayOf(3,0,1)
        val expectedMissing = 2

        val result = operationsBinary.missingNumberWitXor(arr)

        assertEquals(expectedMissing, result)
    }
}
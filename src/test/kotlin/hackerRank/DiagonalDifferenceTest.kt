package hackerRank

import org.junit.jupiter.api.Test

class DiagonalDifferenceTest {
    private val diagonalDifferenceUseCase = DiagonalDifference()



    @Test
    fun `should calculate the absolute difference between the sums of its diagonals`() {
        val squareMatrix = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))

        val expected = 15

        val result = diagonalDifferenceUseCase.diagonalDifference(squareMatrix)

        kotlin.test.assertEquals(expected, result)
    }
}
package hackerRank

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainHackerRankTest {

    private val hackerRank = SolutionsHackerRank()

    @Test
    fun `should calculate the absolute difference between the sums of its diagonals`() {
        val squareMatrix = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))

        val expected = 15

        val result = hackerRank.diagonalDifference(squareMatrix)

        assertEquals(expected, result)
    }
}
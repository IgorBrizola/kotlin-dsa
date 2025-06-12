package hackerRank

import leetCodes.SolutionsLeetCodes
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger(SolutionsHackerRank::class.java)

class SolutionsHackerRank {
    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var j = 0

        val firstDiagonal: MutableList<Int> = mutableListOf()
        val secondDiagonal: MutableList<Int> = mutableListOf()

        for (i in arr.indices) {
            val nextArr = arr[i]
            firstDiagonal.add(nextArr[i])
        }

        for (i in arr.indices.last downTo 0) {
            val nextArr = arr[i]
            secondDiagonal.add(nextArr[j])
            j += 1
        }

        return if (firstDiagonal.sum() >= secondDiagonal.sum()) firstDiagonal.sum() - secondDiagonal.sum() else secondDiagonal.sum() - firstDiagonal.sum()
    }
}
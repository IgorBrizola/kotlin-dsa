package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(ExponentialSearch::class.java)

class ExponentialSearch(
    private val binarySearchUseCase: BinarySearch
) {
    fun exponentialSearch(array: IntArray, target: Int): Int {
        if (array[0] == target) return 0
        var i = 1
        val n = array.size - 1

        while (i < n && array[i] < target) {
            i *= 2
        }

        if (array[i] == target) return i

        return binarySearchUseCase.binarySearch(array, target, i/2, i)
    }

}
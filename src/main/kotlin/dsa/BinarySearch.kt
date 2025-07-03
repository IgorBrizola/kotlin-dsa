package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(BinarySearch::class.java)

class BinarySearch {

    fun binarySearch(arr: IntArray, target: Int, leftPointer: Int? = null, rightPointer: Int? = null): Int {
        var left = leftPointer ?: 0
        var right = rightPointer ?: arr.size

        while (left < right) {
            val mid = (left + right) / 2
            if (arr[mid] == target) return mid
            if (arr[mid] <= target) left = mid
            if (arr[mid] >= target) right = mid
        }

        return -1
    }
}
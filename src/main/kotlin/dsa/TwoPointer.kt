package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(TwoPointer::class.java)

class TwoPointer {

    fun twoPointers(arr: IntArray, target: Int): Int {
        var left = 0
        var right = arr.size -1

        while (left < right) {
            if (arr[left] == target) return left
            if (arr[right] == target) return right
            left++
            right--
        }

        return -1
    }


}
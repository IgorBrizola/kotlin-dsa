package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(BubbleSort::class.java)

class BubbleSort {
    fun bubbleSort(array: IntArray): IntArray {
        val n = array.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }
}
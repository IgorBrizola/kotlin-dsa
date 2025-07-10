package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(BubbleSort::class.java)

class BubbleSort {
    fun bubbleSort(arr: IntArray): IntArray {
        val size = arr.size
        var totalComparisons = 0

        for (i in 0 until size - 1) {
            var isSorted = true
            var comparisonsThisPass = 0

            for (j in 0 until size - 1 - i) {
                totalComparisons++
                comparisonsThisPass++

                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    isSorted = false
                }
            }

            log.info("Pass $i: ${arr.contentToString()} | Comparisons: $comparisonsThisPass")

            if (isSorted) {
                log.info("Array already sorted on pass $i. Total comparisons: $totalComparisons (O(n))")
                break
            }
        }

        log.info("Final sorted array: ${arr.contentToString()}")
        log.info("Total comparisons: $totalComparisons")

        return arr
    }
}

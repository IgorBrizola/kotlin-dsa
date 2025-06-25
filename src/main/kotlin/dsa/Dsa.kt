package dsa

class Dsa {

    // SORTING ARRAY INTEGERS
   // O(n log n): Log-linear time
    fun quickSort(array: IntArray, low: Int, high: Int) {
       if (low < high) {
            val pi = partition(array, low, high)
            quickSort(array, low, pi - 1)
            quickSort(array, pi + 1, high)
        }
    }

    private fun partition(array: IntArray, low: Int, high: Int): Int {
        val pivot = array[high]
        var i = low - 1

        for (j in low until high) {
            if (array[j] < pivot) {
                i++
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }

        val temp = array[i + 1]
        array[i + 1] = array[high]
        array[high] = temp

        return i + 1
    }

    // SORTING ARRAY INTEGERS
    // O(n^2): Quadratic time
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
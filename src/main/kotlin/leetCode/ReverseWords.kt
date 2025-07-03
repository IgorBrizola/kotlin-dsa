package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(ReverseWords::class.java)

class ReverseWords {
    fun reverseWords(s: String): String {
        val sArr = s.toCharArray()
        var left = 0
        var right = 0

        while (right <= sArr.size) {
            if (right == sArr.size || sArr[right] == ' ') {
                var l = left
                var r = right - 1
                while (l < r) {
                    val temp = sArr[l]
                    sArr[l] = sArr[r]
                    sArr[r] = temp
                    l++
                    r--
                }
                left = right + 1
            }
            right++
        }

        return String(sArr)
    }

}
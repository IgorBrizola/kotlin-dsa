package leetCode

class ReversedString {
    fun reverseString(s: CharArray): CharArray {
        var left = 0
        var right = s.size -1

        while (left <= right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp
            right--
            left++
        }
        return s
    }
}
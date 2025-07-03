package dsa

import kotlin.math.max
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(SlidingWindow::class.java)

class SlidingWindow {

    fun slidingWindow(s: String): Int {
        var left = 0
        var right = 0

        var subStringSize = 0

        val counter = hashMapOf<Char, Int>()

        while (right <= s.length -1) {
            counter[s[right]] = (counter[s[right]] ?: 0) + 1
            while ((counter[s[right]] ?: 0) > 2) {
                counter[s[left]] = (counter[s[left]] ?: 0) - 1
                left++
            }
            subStringSize = max(subStringSize, (right - left) + 1)
            right++
        }
        return subStringSize
    }
}
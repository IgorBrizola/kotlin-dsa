package leetCode

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(FirstUniqueCharacterInString::class.java)


class FirstUniqueCharacterInString {
    fun findUniqueCharacterWithHashMap(s: String): Int {
        val map = mutableMapOf<Char, Pair<Int, Int>>()

        for ((index, char) in s.withIndex()) {
            if (map.containsKey(char)) {
                map[char] = Pair(map[char]!!.first, map[char]!!.second + 1)
            } else {
                map[char] = Pair(index, 1)
            }
        }

        for (i in map) {
            if (i.value.second == 1) return i.value.first
        }

        return -1
    }

    fun findUniqueCharacterWithAlphabet(s: String): Int {
        val uniqueChars = IntArray(26)
        var arr =  s.lowercase().toCharArray()

        for (i in arr.indices) {
            uniqueChars[arr[i] - 'a']++
        }

        if (uniqueChars.none { it == 1 }) return -1

        for (i in arr.indices) {
            if (uniqueChars[arr[i] - 'a'] == 1) return i
        }

        return -1
    }
}
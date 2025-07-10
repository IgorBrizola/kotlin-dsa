package dsa

class HashMap {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()

        for ((index, value) in nums.withIndex()) {
            val complement = target - value

            if (hashMap.containsKey(complement)) return intArrayOf(hashMap[complement]!!, index)

            hashMap[value] = index
        }

        return intArrayOf(-1)
    }
}

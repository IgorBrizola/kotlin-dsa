package leetCode

class ContainsNearbyDuplicate {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hashMap = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val num = nums[i]
            if (hashMap.containsKey(num)) {
                val lastIndex = hashMap[num]!!
                if (i - lastIndex <= k) return true
            }
            hashMap[num] = i
        }

        return false
    }
}
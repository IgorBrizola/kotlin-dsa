package dsa

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(OperationsBinary::class.java)

class OperationsBinary {
    fun isOdd(x: Int): Boolean = x.and(1) == 1

    fun isEven(x: Int): Boolean = x.and(0) == 0

    fun missingNumberWitXor(arr: IntArray) : Int {
        var x = 0

        for (num in arr){
            log.info("$x xor $num = ${x xor num}")
            x = x xor num
        }
        for (i in  0..arr.size) {
            log.info("$x xor $i = ${x xor i}")
            x = x xor i
        }
        return x
    }
}
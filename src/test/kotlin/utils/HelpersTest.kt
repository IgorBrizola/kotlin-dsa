package utils

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(HelpersTest::class.java)

object HelpersTest {
        fun measureExecutionTime(title: String = "", complexity: String, block: () -> Unit) {
            val start = System.nanoTime()
            block()
            val end = System.nanoTime()
            log.info("$title -> Tempo: ${(end - start) / 1_000_000.0} ms")
            log.info("Complexity -> $complexity")
        }
}
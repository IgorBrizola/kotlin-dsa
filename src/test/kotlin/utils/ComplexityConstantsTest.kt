package utils

import org.junit.jupiter.api.Assertions.*

object ComplexityConstantsTest {
    const val COMPLEXITY_O_1 = "O(1)"                 // Constant time
    const val COMPLEXITY_O_LOG_N = "O(log n)"         // Logarithmic time
    const val COMPLEXITY_O_N = "O(n)"                 // Linear time
    const val COMPLEXITY_O_N_LOG_N = "O(n log n)"     // Linearithmic time
    const val COMPLEXITY_O_N_SQUARED = "O(n^2)"       // Quadratic time
    const val COMPLEXITY_O_N_CUBED = "O(n^3)"         // Cubic time
    const val COMPLEXITY_O_2_POW_N = "O(2^n)"         // Exponential time
    const val COMPLEXITY_O_N_FACTORIAL = "O(n!)"      // Factorial time
    const val COMPLEXITY_O_SQRT_N = "O(√n)"           // Square root time
    const val COMPLEXITY_O_LOG_LOG_N = "O(log log n)" // Double logarithmic time
    const val COMPLEXITY_O_N_POW_K = "O(n^k)"         // Polynomial time (generic)
    const val COMPLEXITY_O_K_LOG_N = "O(k log n)"     // Example in heaps/merges
}
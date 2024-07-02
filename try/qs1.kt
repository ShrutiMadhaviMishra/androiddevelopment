fun divide(a: Int, b: Int): String {
    return try {
        val result = a / b
        "Division result: $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero is not allowed."
    }
}

fun main() {
    println(divide(10, 2))   
    println(divide(8, 0))    
      
}

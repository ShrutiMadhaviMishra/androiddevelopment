fun isPalindrome(input: String): Boolean {
    val normalizedInput = input.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
    val length = normalizedInput.length
    var left = 0
    var right = length - 1

    while (left < right) {
        if (normalizedInput[left] != normalizedInput[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

fun main() {
    val testString1 = "A man, a plan, a canal, Panama"
    val testString2 = "hello"

    println("Is '$testString1' a palindrome? ${isPalindrome(testString1)}")
    println("Is '$testString2' a palindrome? ${isPalindrome(testString2)}")
}


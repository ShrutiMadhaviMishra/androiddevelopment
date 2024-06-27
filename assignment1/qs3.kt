fun main() {
    val n = "1203"

    val DuckNum = if (n.startsWith('0')) {
        false
    } else {
        n.contains('0')
    }

    if (DuckNum) {
        println("$n is a Duck number.")
    } else {
        println("$n is not a Duck number.")
    }
}

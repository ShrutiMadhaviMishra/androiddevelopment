fun string(inputList: List<String>): Map<String, Int> {
    val lengthMap = mutableMapOf<String, Int>()

    for (str in inputList) {
        var length = 0
        for (char in str) {
            length++
        }
        lengthMap[str] = length
    }

    return lengthMap
}
fun main() {
    val inputArray = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    val groupedWords = inputArray.groupBy { it.toCharArray().sorted().joinToString() }

    groupedWords.values.forEach { group ->
        println(group.joinToString())
    }
}
fun main(args: Array<String>) {
    if (args.size >= 2) {
        val isAnagram = anagram(args[0], args[1])

        println("'${args[0]}' and '${args[1]}' is an anagram: $isAnagram")
    } else {
        println("Usage: anagram text1 text2")
    }
}

fun anagram(s1: String, s2: String): Boolean {
    // we care only about ASCII (7-bit) - ignore everything else
    val characters = IntArray(26)

    updateArray(s1, characters, Int::inc)
    updateArray(s2, characters, Int::dec)

    return characters.all { i -> i == 0 }
}

fun updateArray(s: String, array: IntArray, f : (Int)-> Int) {
    for (c in s) {
        when (val code = c.code) {
            // ignore case
            in 'A'.code..'Z'.code -> array[code - 65] = f(array[code - 65])
            in 'a'.code..'z'.code -> array[code - 97] = f(array[code - 97])
            // ignore non-ASCII characters
            else -> println("ignore '$c'")
        }
    }
}

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainTest {

    @Test
    fun testAnagram() {

        val isAnagram = anagram("lorem ipsum", "sumipmerol")

        assertTrue(isAnagram)

    }

    @Test
    fun testAnagram_false() {

        val isAnagram = anagram("lorem ipsum", "lorem ipsum a")

        assertFalse(isAnagram)
    }

    @Test
    fun testAnagram_edge_cases() {

        val isAnagram = anagram("lorem ipsum za", "sumipmerol  AZ")

        assertTrue(isAnagram)
    }

    @Test
    fun testAnagram_ignore_umlaut() {

        val isAnagram = anagram("lorem ipsum", "sumipmerol  ä")

        assertTrue(isAnagram)
    }

    @Test
    fun testAnagram_ignore_upper_case() {

        val isAnagram = anagram("lorem ipsum", "SUMIPMEROL  ä")

        assertTrue(isAnagram)
    }

    @Test
    fun testAnagram_ignore_number() {

        val isAnagram = anagram("lorem ipsum", "SUMIPMEROL  2")

        assertTrue(isAnagram)
    }


}
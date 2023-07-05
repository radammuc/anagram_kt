import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun testAnagram() {

        val isAnagram = anagram("lorem ipsum", "sumipmerol")

        assertTrue(isAnagram)

    }

    @Test
    fun testAnagram_false() {

        val isAnagram = anagram("lorem ipsum", "sumipmerol  z")

        assertFalse(isAnagram)
    }

    @Test
    fun testAnagram_z() {

        val isAnagram = anagram("lorem ipsum z", "sumipmerol  z")

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


}
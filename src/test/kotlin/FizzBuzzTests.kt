import org.example.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

internal class FizzBuzzTests {
    private val sut : FizzBuzz = FizzBuzz()

    @Test
    fun generateNumbersShouldReturnNumbersFrom1To100(){
        val actual = sut.generateNumbers()
        assertEquals(1, actual[0])
        // Letzter soll 100 sein
        // Anzahl Items = 100
    }

    @Test
    fun generateNumbersShouldReturnList(){
        val actual = sut.generateNumbers()
        // assert is List (actual)
        assertIs<List<Int>>(actual)
    }

    @Test
    fun generateNumbersShould1AsFirstListElement() {
        val actual = sut.generateNumbers()
        // assert actual[0] Equals 1
    }

}


import org.example.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotEquals

internal class FizzBuzzTests {
    private val sut : FizzBuzz = FizzBuzz()

    // this may help:
    // https://phauer.com/2018/best-practices-unit-testing-kotlin/


    @Test
    fun translateShould1for1(){
        val numbers = listOf(1)
        val actual = sut.translate(numbers)

    }

    @Test
    fun translateShouldReturnString(){
        val numbers = listOf(1,2,3)
        val actual = sut.translate(numbers)
        assertIs<List<String>>(actual)
    }

    @Test
    fun generateNumbersShouldReturnNumbersFrom1To100(){
        // val: immutable, var: mutable
        val actual = sut.generateNumbers()
        assertEquals(1, actual[0])
        assertEquals(100, actual.last())
        assertEquals(100, actual.size)
    }

    @Test
    fun generateNumbersShouldReturnList(){
        val actual = sut.generateNumbers()
        assertIs<List<Int>>(actual)
    }

    @Test
    fun generateNumbersShould1AsFirstListElement() {
        val actual = sut.generateNumbers()
        val sizeOfActual = actual.size
        assertNotEquals(0, sizeOfActual)
        assertEquals( 1, actual[0])
    }
}


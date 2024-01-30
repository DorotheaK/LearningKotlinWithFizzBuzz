
import org.example.Sample
import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest{
    private val sut = Sample()

    @Test
    fun testSum() {
        val expected = 42
        val actual = sut.sum(30, 12)
        assertEquals(expected, actual)
    }

}
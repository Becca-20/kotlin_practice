import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task_1Test {

    @Test
    fun `verify that describePerson returns String with arguments when both are given`() {
        val result = describePerson("Jane", 24)
        assertEquals("Jane is 24 years old.", result)
    }

    @Test
    fun `verify that describePerson returns String with arguments when only name given`() {
        val result = describePerson("Faye")
        assertEquals("Faye is 30 years old.", result)
    }

    @Test
    fun `verify that describePerson returns expected String with both arguments named`() {
        val result = describePerson(name = "Melon", age = 88)
        assertEquals("Melon is 88 years old.", result)
    }

    @Test
    fun `verify that describePerson returns expected String with named arguments in different order`() {
        val result = describePerson(age = 48, name = "Billy Bob")
        assertEquals("Billy Bob is 48 years old.", result)
    }
}
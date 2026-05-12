import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task_2Test {

    @Test
    fun `verify that getBookSummary returns expected string given a Book with all args`() {
        val testBook = Book("ABC", "ABC", 1999, listOf("ABC", "ABC"))

        assertEquals("ABC by ABC (1999) - Genres: ABC, ABC", getBookSummary(testBook))
    }

    @Test
    fun `verify that getBookSummary returns expected string given a Book without yearPublished`(){
        val testBook = Book("ABC", "ABC", genres = listOf("ABC", "ABC"))

        assertEquals("ABC by ABC (2024) - Genres: ABC, ABC", getBookSummary(testBook))
    }

    @Test
    fun `verify that getBookSummary returns expected string given a Book without genres`(){
        val testBook = Book("ABC", "ABC", 1999)

        assertEquals("ABC by ABC (1999) - Genres: none", getBookSummary(testBook))
    }

    @Test
    fun `verify that getBookSummary returns expected string given a Book without yearPublished or genres`(){
        val testBook = Book("ABC", "ABC")

        assertEquals("ABC by ABC (2024) - Genres: none", getBookSummary(testBook))
    }
}
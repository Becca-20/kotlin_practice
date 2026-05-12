//Create a Book data class with these properties:
//- title (String)
//- author (String)
//- yearPublished (Int, default value = 2024)
//- genres (List<String>, default value = empty list)
//
//Then write a function called getBookSummary that takes a Book and returns a String in this format:
//"Title" by Author (Year) - Genres: Genre1, Genre2
//
//Rules:
//- If the book has no genres, the genres part should say Genres: none
//- Write at least 4 tests covering different cases
//
//Expected output:
//val book = Book("Dune", "Frank Herbert", 1965, listOf("Sci-Fi", "Adventure"))
//getBookSummary(book)
//// Returns: "Dune" by Frank Herbert (1965) - Genres: Sci-Fi, Adventure


data class Book(
    val title: String,
    val author: String,
    val yearPublished: Int = 2024,
    val genres: List<String> = emptyList()
)

internal fun getBookSummary(book: Book): String{
    if (book.genres.isEmpty()){
        return "${book.title} by ${book.author} (${book.yearPublished}) - Genres: none"
    }
    return "${book.title} by ${book.author} (${book.yearPublished}) - Genres: ${book.genres.joinToString(", ")}"
    // .joinToString -> means that there's no [] around the genres bc it's not calling the whole list

//    // fewer lines of code:
//    val genreString = book.genres.ifEmpty { listOf("none") }.joinToString(", ")
//    return "${book.title} by ${book.author} (${book.yearPublished}) - Genres: $genreString"
}

fun main(){
    println(getBookSummary(Book("Dune", "Frank Herbert", 1965, listOf("Sci-Fi", "Adventure"))))
}
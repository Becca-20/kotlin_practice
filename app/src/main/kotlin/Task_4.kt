import jdk.vm.ci.meta.JavaKind
import kotlin.Char

//Write a function called parseInitials that takes a full name as a String? and returns the initials as a String?.
//
//Rules:
//- If the input is null, return null
//- If the input is blank or empty, return null
//- If the input has one word (e.g. "Cher"), return the first letter uppercased plus a dot (e.g. "C.")
//- If the input has two or more words (e.g. "john doe"), return the first letter of the first and last words, uppercased with dots (e.g. "J.D.")
//- Middle names should be ignored (e.g. "John Michael Doe" → "J.D.")
//
//EXAMPLES:
//parseInitials("Alice Cooper")   // "A.C."
//parseInitials("cher")           // "C."
//parseInitials("John Michael Doe") // "J.D."
//parseInitials("")               // null
//parseInitials(null)             // null
//parseInitials("   ")            // null

fun parseInitials(fullName: String?): String? {
    if (fullName.isNullOrEmpty() || !fullName.contains()){
        return null
    } else if (!fullName.contains(" ")){
        val singleInitial = "${fullName.first().uppercase()}."
        return singleInitial
    } else if (fullName.contains(" ").also { fullName.contains(" ") }) {
        val lastSpace: String = fullName.findLast { it == ' ' }.toString()
        val ignoreMiddleName = "${fullName.first().uppercase()}.${lastSpace.substringAfter(" ").first().uppercase()}."
        return ignoreMiddleName
    } else {
        val initials = "${fullName.first().uppercase()}.${fullName.substringAfter(" ").first().uppercase()}."
        return initials
    }
}

fun main(){
    println(parseInitials("Alice Cooper"))
    println(parseInitials("cher"))
    println(parseInitials("John Michael Doe"))
    println(parseInitials(""))
    println(parseInitials(null))
    println(parseInitials("   "))
}
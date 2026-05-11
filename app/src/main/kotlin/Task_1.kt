// Create a function called describePerson that takes a name (String) and an age (Int). The age should have a default value of 30. The function should return a sentence like: "Alex is 25 years old."

// Then call it three times:
// - With both name and age
// - With only a name
// - With the age first and name second (using named arguments)

fun main() {
    describePerson("Susan", 42)
    describePerson("Alex")
}

fun describePerson(name: String, age: Int = 30) {
    println("${name} is ${age} years old.")
}
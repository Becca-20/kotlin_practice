//Create a class called CounterViewModel. It should:
//
//- Hold a private count integer starting at 0
//- Have a function getCount() that returns the current count
//- Have a function increment() that adds 1 to the count
//- Have a function decrement() that subtracts 1 from the count
//- Have a function reset() that sets count back to 0
//- decrement() should not go below 0. If count is 0 and decrement() is called, it stays 0.


class CounterViewModel(
    private var count: Int = 0
) {
    fun getCount(): Int {
        return count
    }

    fun increment(): Int {
        return ++count
    }

    fun decrement(): Int {
        if (count == 0){
            return 0
        }
        return --count
    }

    fun reset(): Int {
        count = 0
        return count
    }
}

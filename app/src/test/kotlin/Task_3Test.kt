import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CounterViewModelTest {

    private val viewModel = CounterViewModel()

    @Test
    fun `verify that count starts at 0`(){
        assertEquals(0, viewModel.getCount())
    }

    @Test
    fun `verify that getCount returns count`(){
        repeat(2) { viewModel.increment() }
        assertEquals(2, viewModel.getCount())
    }

    @Test
    fun `verify that count returns plus one with increment`(){
        viewModel.increment()
        assertEquals(1, viewModel.getCount())
    }

    @Test
    fun `verify that count returns same with decrement on 0`(){
        viewModel.decrement()
        assertEquals(0, viewModel.getCount())
    }

    @Test
    fun `verify that count returns decrease with decrement`(){
        repeat(5) { viewModel.increment() }
        assertEquals(5, viewModel.getCount())

        viewModel.decrement()
        assertEquals(4, viewModel.getCount())
    }

    @Test
    fun `verify that count resets to 0`(){
        repeat(5) { viewModel.increment() }
        assertEquals(5, viewModel.getCount())

        viewModel.reset()
        assertEquals(0, viewModel.getCount())
    }

}
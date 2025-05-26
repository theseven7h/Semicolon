import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSortSquaresOf {
		
	@Test
	public void testSortSquaresOfFunctionReturnsCorrect() {
		FM func = new FM();
		int[] numbers = {9,2,7,0,-5};
		int[] actual = func.sortSquaresOf(numbers);
		int[] expected = {0,4,25,49,81};
		assertArrayEquals(actual, expected);
	}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmallestIndexOfLargest {
	SmallestIndexOfLargest idx = new SmallestIndexOfLargest();
	
	@Test
	void testSmallestIndexOfFunctionExists() {
		int[] numbers = {1,5,3,4,5,5};
		idx.indexOf(numbers);
	}
	
	@Test
	void testSmallestIndexOfFunctionReturnsRightOutput() {
		int[] numbers = {1,5,3,4,5,5};
		int actual = idx.indexOf(numbers);
		int expected = 1;
		assertEquals(actual, expected);
	}
}

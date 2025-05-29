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
		
		int[] numbers2 = {1,2,8,20,5};
		int actual2 = idx.indexOf(numbers2);
		int expected2 = 3;
		assertEquals(actual2, expected2);
	}
	
	@Test
	void testSmallestIndexOfFunctionReturnsRightWhenElementsAreNegative() {
		int[] numbers = {-1,-45,-73,-4,-95,-5};
		int actual = idx.indexOf(numbers);
		int expected = 0;
		assertEquals(actual, expected);
	}
}

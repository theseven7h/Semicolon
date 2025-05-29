import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFactors {
	Factors factor = new Factors();
	
	@Test
	void testFactorsOfFunctionExists() {
		int number = 7;
		factor.factorsOf(number);
	}
	
	@Test
	void testFactorsOfFunctionReturnsRightOutput() {
		int number = 7;
		int[] actual = factor.factorsOf(number);
		int[] expected = {1,7};
		assertArrayEquals(actual, expected);
		
		int number2 = 24;
		int[] actual2 = factor.factorsOf(number2);
		int[] expected2 = {1,2,3,4,6,8,12,24};
		assertArrayEquals(actual2, expected2);
	}
	
	/*@Test
	void testSmallestIndexOfFunctionReturnsRightWhenElementsAreNegative() {
		int[] numbers = {-1,-45,-73,-4,-95,-5};
		int actual = idx.indexOf(numbers);
		int expected = 0;
		assertEquals(actual, expected);
	}*/
}
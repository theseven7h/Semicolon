import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDescendSort {
	DescendSort desc = new DescendSort();
	
	@Test
	void testSortFunctionExists() {
		int[] num1 = {3,1,5};
		int[] num2 = {8,6,4};
		desc.sort(num1, num2);
	}
	
	@Test
	void testSortFunctionReturnsRightAnswer() {
		int[] num1 = {3,1,5};
		int[] num2 = {8,6,4};
		int[] actual = desc.sort(num1, num2);
		int[] expected = {8,6,5,4,3,1};
		assertArrayEquals(actual, expected);
		
		int[] num3 = {7,4,1};
		int[] num4 = {9,3,2};
		int[] actual2 = desc.sort(num3, num4);
		int[] expected2 = {9,7,4,3,2,1};
		assertArrayEquals(actual2, expected2);
	}
}

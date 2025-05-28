import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLargest {
	Largest large = new Largest();
	
	@Test
	void testLocateLargestOfFunctionExists() {
		int[][] numbers = {{1,3},{4,5},{6,7}};
		large.locateLargestOf(numbers);
	}
	
	/*@Test
	void testtestLocateLargestOfFunctionReturnsRightSum() {
		int[][] numbers = {{1,3},{4,5},{6,7}};
		int[] expected = {2,1};
		assertEquals(expected, large.locateLargestOf(numbers));	
	}*/
	
}

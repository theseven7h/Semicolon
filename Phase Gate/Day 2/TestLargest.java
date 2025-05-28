import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLargest {
	Largest large = new Largest();
	
	@Test
	void testLocateLargestOfFunctionExists() {
		double[][] numbers = {{1.0,3.0},{4.0,5.0},{6.0,7.0}};
		large.locateLargestOf(numbers);
	}
	
	@Test
	void testtestLocateLargestOfFunctionReturnsRightSum() {
		double[][] numbers = {{1.0,3.0},{4.0,5.0},{6.0,7.0}};
		int[] expected = {2,1};
		assertArrayEquals(expected, large.locateLargestOf(numbers));	
	}
	
}

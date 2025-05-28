import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUniqueValues {
	UniqueValues unique = new UniqueValues();
	
	@Test
	void testSumUniqueInFunctionExists() {
		int[] numbers = {1,2,3,2};
		unique.sumUniqueIn(numbers);
	}
	
	@Test
	void testSumUniqueInFunctionReturnsRightSum() {
		int[] numbers = {1,2,3,2,5,6};
		assertEquals(15, unique.sumUniqueIn(numbers));	
	}
	
	@Test
	void testSumUniqueInFunctionReturnsZeroWhenNoUniqueValues() {
		int[] numbers = {1,1,1,1,1};
		assertEquals(0, unique.sumUniqueIn(numbers));	
	}
}


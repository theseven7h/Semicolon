import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDuplicate {
	Duplicate dup = new Duplicate();
	
	@Test
	void testomitDuplicateInFunctionExists() {
		int[] numbers = {1,2,3,2};
		dup.omitDuplicateIn(numbers);
	}
	
	@Test
	void testomitDuplicateInFunctionReturnsRightSum() {
		int[] numbers = {1,2,2,3,4,4,5,6,6,7};
		int[] expected = {1,2,3,4,5,6,7};
		assertEquals(expected, dup.omitDuplicateIn(numbers));	
	}
	
}
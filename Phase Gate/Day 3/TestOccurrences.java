import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOccurrences {
	Occurrences occ = new Occurrences();
	
	@Test
	void testOccurrencesInFunctionExists() {
		String word = "Hello World";
		char ch = 'o';
		occ.occurrencesIn(word, ch);
	}
	
	@Test
	void testOccurrencesInFunctionReturnsRightOutput() {
		String word = "Hello World";
		char ch = 'o';
		int actual = occ.occurrencesIn(word, ch);
		int expected = 2;
		assertEquals(actual, expected);
	}
}
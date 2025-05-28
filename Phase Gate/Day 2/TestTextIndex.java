import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTextIndex {
	TextIndex idx = new TextIndex();
	
	@Test
	void testreverseFunctionExists() {
		String word = "abcdefd";
		String pos = "d";
		idx.reverse(word,pos);
	}
	
	@Test
	void testreverseFunctionReturnsRightSum() {
		String word = "abcdefd";
		String pos = "d";
		String expected = "dabcefd";
		assertEquals(expected, idx.reverse(word,pos));	
	}
	
}
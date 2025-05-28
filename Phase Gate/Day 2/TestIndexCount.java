import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIndexCount {
	IndexCount idx = new IndexCount();
	
	@Test
	void testIndexIsRightFunctionExists() {
		idx.indexIsRight("1210");
	}
	
	@Test
	void testIndexIsRightReturnsTrue() {
		assertTrue(idx.indexIsRight("1210"));
	}
	
	@Test
	void testIndexIsWrongReturnsFalse() {
		assertFalse(idx.indexIsRight("030"));
	}
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class TestIndexCount {
	IndexCount idx = new IndexCount();
	
	@Test
	void testIndexIsRightFunctionExists() {
		idx.indexIsRight("1210");
	}
}

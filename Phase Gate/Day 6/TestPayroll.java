import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TestPayroll {
	Payroll pay = new Payroll();

	@Test
	public void testCheckNameFunctionExists() {
		ArrayList <String> names = new ArrayList<>();
		pay.checkName(names, "James");
	}
	
	@Test
	public void testCheckNameFunctionReturnsNameExists() {
		ArrayList <String> names = new ArrayList<>();
		names.add("James");
		assertEquals("James already exists!", pay.checkName(names, "James"));
	}
	
	@Test
	public void testCheckNameFunctionReturnsRightResult() {
		ArrayList <String> names = new ArrayList<>();
		names.add("James");
		assertEquals("Added!", pay.checkName(names, "Phil"));
	}
	
	@Test
	public void testaddNameFunctionExists() {
		ArrayList <String> names = new ArrayList<>();
		names.add("James");
		pay.addName(names, "Phil");
	}
	
	@Test
	public void testaddNameFunctionAddsNames() {
		ArrayList <String> names = new ArrayList<>();
		names.add("James");
		pay.addName(names, "Phil");
		assertEquals(names.get(0), "James");
	}
}
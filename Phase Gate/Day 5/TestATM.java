import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TestATM {
	ATM atm = new ATM();

	@Test
	public void testMessageFunctionExists() {
		atm.message(4000, 1000);
	}
	
	@Test
	public void testWithdrawFunctionExists() {
		atm.withdraw(4000, 1000);
	}
	
	@Test
	public void testWithdrawFunctionReturnsCorrectBalance() {
		assertEquals(atm.withdraw(4000, 1000), 2900);
	}
	
	@Test
	public void testMessageBalanceLessThanAmount() {
		assertEquals(atm.message(4000, 17000), "Insufficient funds");	
	}
	
	@Test
	public void testMessageAmountNotMultipleOf500or1000() {
		assertEquals(atm.message(4000, 900), "Invalid amount! Withdrawals must be in multiples of N500 or N1000");	
	}
	
	@Test
	public void testMessageAmountGreaterThan90Percent() {
		assertEquals(atm.message(3600, 3500), "You cannot withdraw more than 90% of your balance");	
	}
	
	@Test
	public void testMessageAmountIsZero() {
		assertEquals(atm.message(4000, 0), "Amount must be greater than N0");	
	}
	
	@Test
	public void testMessageAmountGreaterThan20000() {
		assertEquals(atm.message(100000, 21000), "You cannot exceed N20000 per transaction");
	}
		
	@Test
	public void testMessageAmountIsValid() {
		assertEquals(atm.message(100000, 12000), "Transaction successful!");	
	}
}
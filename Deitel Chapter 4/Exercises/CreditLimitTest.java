public class CreditLimitTest {
	public static void main(String[] args) {
		CreditLimit customer1 = new CreditLimit(45123, 120000, 700, 4000, 7000);
		CreditLimit customer2 = new CreditLimit(35153, 6032, 340, 3721, 7000);

		int result1 = customer1.nextBalance();		 

		System.out.printf("Account number: %d %nBeginning Balance: $%d %nTotal Charges: $%d %nTotal Credit: $%d %nAllowed Credit Limit: $%d %nNew Balance: $%d%n", customer1.getAcctNo(), customer1.getBeginningBalance(), customer1.getTotalCharged(), customer1.getTotalCredit(), customer1.getCreditLimit(), result1);
		customer1.getLimitCheck();
		int result2 = customer2.nextBalance();	 

		System.out.printf("%n%nAccount number: %d %nBeginning Balance: $%d %nTotal Charges: $%d %nTotal Credit: $%d %nAllowed Credit Limit: $%d %nNew Balance: $%d%n", customer2.getAcctNo(), customer2.getBeginningBalance(), customer2.getTotalCharged(), customer2.getTotalCredit(), customer2.getCreditLimit(), result2);
		customer2.getLimitCheck();
	}
}
		
	
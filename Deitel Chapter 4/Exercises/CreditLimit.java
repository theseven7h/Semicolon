public class CreditLimit {
	private int acctNo;
	private int beginningBalance;
	private int totalCharged;
	private int totalCredit;
	private int creditLimit;
		
	public CreditLimit (int acctNo, int beginningBalance, int totalCharged, int totalCredit, int creditLimit) {
		this.acctNo = acctNo;
		if (beginningBalance > 0.0) {
			this.beginningBalance = beginningBalance;
		}	
		if (totalCharged > 0.0) {
			this.totalCharged = totalCharged;
		}
			this.totalCredit = totalCredit;
			this.creditLimit = creditLimit;
	}
		
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
		
	public int getAcctNo() {
		return acctNo;
	}
		
	public void setBeginningBalance(int beginningBalance) {
		if (beginningBalance > 0.0) {
			this.beginningBalance = beginningBalance;
		}
	}
		
	public int getBeginningBalance() {
		return beginningBalance;
	}
		
	public void setTotalCharged(int totalCharged) {
		if (totalCharged > 0.0) {
			this.totalCharged = totalCharged;
		}
	}
		
	public int getTotalCharged() {
		return totalCharged;
	}
		
	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}
		
	public int getTotalCredit() {
		return totalCredit;
	}		
		 
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
		
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public int nextBalance() {
		int newBalance = beginningBalance + totalCharged - totalCredit;
		return newBalance;
	}
	
	public void getLimitCheck() {
		if (nextBalance() > creditLimit) {
			System.out.print("Credit limit is exceeded");
		}
		else {
			System.out.print("Limit not exceeded");
		}
	}
}				
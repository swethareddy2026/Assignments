public class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;
	private String accountType;
	private int transactionCount = 0;
	private String depositDetails = "";

	public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
		if (balance < 0)
			System.out.println("Balance cannot be negative");
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.holderName = holderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	
	public String getDepositDetails() {
		return depositDetails;
	}

	public void setDepositDetails(String depositDetails) {
		this.depositDetails = depositDetails;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	// method for deposit
	public double deposit(double amt) {
		if (amt > 0) {
			this.setBalance(this.getBalance()+amt);
			this.setTransactionCount(this.getTransactionCount()+1);
		} else
			System.out.println("Deposit amount cannot be less than zero");
		return balance;

	}

	// method for withdraw
	public double withdraw(double amt) {
		if (amt > balance)
			System.out.println("cannot withdraw more than balance");
		else
		{
			this.setBalance(this.getBalance()-amt);
			this.setTransactionCount(this.getTransactionCount()+1);
		}
		return balance;

	}

	// method to transfer to another account
	public void transfer(BankAccount target, double amt) {
		this.withdraw(amt);
		target.deposit(amt);
		depositDetails+= "An amount of Rs. " + amt + " was withdrawn from " + this.getAccountNumber() + " and deposited into account " + target.getAccountNumber() + "\n";
		
	}
	
	public void displayStatement() {
		System.out.println(depositDetails);
				
	}
	
}

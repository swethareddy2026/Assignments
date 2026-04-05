
public class Main {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount("123456", "John", 10000, "Checking");
		BankAccount customer2 = new BankAccount("654321", "Bill", 20000, "Savings");
		
		customer1.transfer(customer2, 500);
		customer2.transfer(customer1, 1000);
		customer1.transfer(customer2, 2000);
		customer2.transfer(customer1, 1000 );
		customer2.transfer(customer1, 5000);
		
		customer1.displayStatement();
		customer2.displayStatement();
		
		System.out.println("The final balance of account: " + customer1.getAccountNumber() + " is " + customer1.getBalance());
		System.out.println("The final balance of account: " + customer2.getAccountNumber() + " is " + customer2.getBalance());
	}

}

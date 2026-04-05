
public class Main {

	public static void main(String[] args) {

		Payment[] payments = new Payment[4];
		//Payment p = new Payment(100, "Bob"); abstract classes cannot be instantiated
		payments[0] = new CashPayment(500.0, "Ram");
		payments[1] = new CardPayment(1500.0, "Rohan", "1234", "HDFC");
		payments[2] = new UPIPayment(750.0, "Shyam", "Shyamupi");
		payments[3] = new EMIPayment(12000.0, "John", 6);

		for (Payment p : payments) {
			p.processPayment(); //
			p.displayReceipt();
			System.out.println();
		}
	}

}

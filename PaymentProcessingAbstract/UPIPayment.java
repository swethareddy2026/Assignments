public class UPIPayment extends Payment {	

	String upiId;

	public UPIPayment(double amount, String payerName, String upiId) {
		super(amount, payerName);
		this.upiId = upiId;
	}
	
	@Override
	public void processPayment() {
		this.setPaymentStatus("Sucess");
		System.out.println("Processing....." + " Success");
	}

}

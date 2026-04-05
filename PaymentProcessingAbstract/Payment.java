
public abstract class Payment {
	double amount;
	String payerName;
	String paymentStatus;
	
	  public Payment(double amount, String payerName) {
	        this.amount = amount;
	        this.payerName = payerName;
	        this.paymentStatus = "failed"; // Default status
	    }

	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public abstract void processPayment();
	
	public void displayReceipt()
	{
		System.out.println("The name of the payer is: " + this.getPayerName());
		System.out.println("The amount is: " + this.getAmount() );
		System.out.println("Payment staus is: " + this.getPaymentStatus());
	}

	

}

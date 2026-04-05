
class CashPayment extends Payment {
	public CashPayment(double amount, String payerName) {
		super(amount, payerName);
	}

	@Override
	public void processPayment() {
		this.setPaymentStatus("Sucess");
		System.out.println("Cash payment of Rs." + this.getAmount() + " received from " + this.getPayerName() + ".");
	}
}

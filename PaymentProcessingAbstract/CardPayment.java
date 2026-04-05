
public class CardPayment extends Payment {

	String cardNumber; // Only storing last 4 digits
	String bankName;

	public CardPayment(double amount, String payerName, String cardNumber, String bankName) {
		super(amount, payerName);
		this.cardNumber = cardNumber;
		this.bankName = bankName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public void processPayment() {
		this.setPaymentStatus("Sucess");
		System.out.println("Card payment of Rs." + this.getAmount() + " received from " + this.getPayerName() +" from Bank " +this.getBankName()+ ".");
	}

}

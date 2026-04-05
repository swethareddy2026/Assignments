
public class EMIPayment extends Payment {
	
	int months;

    public EMIPayment(double amount, String payerName, int months) {
        super(amount, payerName);
        this.months = months;
    }
    

    public int getMonths() {
		return months;
	}


	public void setMonths(int months) {
		this.months = months;
	}


	@Override
	public void processPayment() {
        double monthlyAmount = amount / months;
        this.paymentStatus = "Success";
        System.out.println("EMI Payment: Rs." + this.getAmount() + " divided over " + this.getMonths() + 
                           " months. Monthly Installment: Rs." + String.format("%.2f", monthlyAmount));
    }

}

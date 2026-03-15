
public class ShoppingCart {
	
	//4th question in the assignment

	public static void main(String[] args) {
		final int rice5kg = 250;
		final int oil1l = 180;
		final int bread = 45;
		final int milk2l = 90;
		final int eggs12 = 84;

		//to calculate subtotal
		float subTotal = rice5kg + oil1l + bread + milk2l + eggs12;
		System.out.println("Subtotal:\tRs." + subTotal);

		//calculate GST
//		float gst = (subTotal > 500) ? (0.05f * subTotal) : 0;
		float gst = (subTotal > 500) ? ((5/100f) * subTotal) : 0;
		//subtotal with GST
		subTotal += gst;
		System.out.println("GST(5%):\tRs." + gst);

		//calculate discount
		float discount = (subTotal > 600) ? (0.1f * subTotal) : 0;
		//total with discount
		subTotal -= discount;
		System.out.println("Discount:\tRs." + discount);

		System.out.println("Total:\t\tRs." + subTotal);

	}

}

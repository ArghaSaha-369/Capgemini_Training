package day_15_task1_paymentSystem;

public class PaypalPayment extends Payment{
	@Override
	public void processPayment() {
		double d = discount();
		
		System.out.println("Processing PayPal Payment....");
		System.out.println("Transaction ID:"+ getTransactionId());
		System.out.println("Original Amount:"+ getAmount());
		System.out.println("Discount Applied:"+ d);
		double fee = 0.03 * getAmount();
		double finalAmount = getAmount() + fee - d;
		System.out.println("Transaction Fee:"+ fee);
		System.out.println("Final Payable Amount"+ finalAmount);
		System.out.println("PayPal Payment Successful");
	}
	public PaypalPayment(int amount, String transactionId) {
		super(amount, transactionId);
	}
}

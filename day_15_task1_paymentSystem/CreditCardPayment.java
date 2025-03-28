package day_15_task1_paymentSystem;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		double d = discount();
		
		System.out.println("Processing Credit Card Payment....");
		System.out.println("Transaction ID:"+ getTransactionId());
		System.out.println("Original Amount:"+ getAmount());
		System.out.println("Discount Applied:"+ d);
		double fee = 0.03 * getAmount();
		double finalAmount = getAmount() + fee - d;
		System.out.println("Transaction Fee:"+ fee);
		System.out.println("Final Payable Amount"+ finalAmount);
		System.out.println("Credit Card Payment Successful");
	}
	public CreditCardPayment(int amount, String transactionId) {
		super(amount, transactionId);
	}
}

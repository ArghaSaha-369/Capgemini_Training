package day_15_task1_paymentSystem;

public abstract class Payment {
	
	private int amount;
	private String transactionId;
	
	public abstract void processPayment();
	
	public Payment(int amount, String transactionId) {
		this.amount=amount;
		this.transactionId= transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public String getTransactionId() {
		return transactionId;
	}
	
	public double discount() {
		
		double d;
		if (amount > 500) {
			d = 0.1 * amount;
		}
		else {
			d = 0.0;
		}
		return d;
	}
	
	
}

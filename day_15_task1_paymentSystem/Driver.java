package day_15_task1_paymentSystem;

public class Driver {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment(2000, "ABC123");
		Payment p2 = new PaypalPayment(5000, "XYZ456");
		p1.processPayment();
		System.out.println("\n---------------------------------------------\n");
		p2.processPayment();
	}
}

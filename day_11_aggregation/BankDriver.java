package day_11_aggregation;

public class BankDriver {
	public static void main(String[] args) {
		Customer c = new Customer("Shah Rukh Khan");
		Bank b = new Bank("World Bank", c);
		b.display();
		b =null;
		System.out.println(c.customerName);
	}
}

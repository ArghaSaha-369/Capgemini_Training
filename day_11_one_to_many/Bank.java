package day_11_one_to_many;

public class Bank {
	Customer[] customers;
	String bankName;
	static int count = 0;

	public Bank(int size, String bankName) {
		this.customers = new Customer[size];
		this.bankName = bankName;
	}

	public void addCustomer(Customer customer) {
		if (count < customers.length) {
			customers[count++] = customer;
		} else {
			System.out.println("Can't add customer anymore");
		}
	}

	public void displayCustomers() {
		for (int i = 0; i < count; i++) {
			System.out.println(customers[i].customerName);
		}
	}
}
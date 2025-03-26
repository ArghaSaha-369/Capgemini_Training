package day_13_accessModifiers;

public class Driver {
	public static void main(String[] args) {
		Car c = new Car("530", "Tata", "Nexon", 4500, 4);
		Bike b = new Bike("220", "Mercedes", "Benz", 10000, true);
		c.displayDetails();
		b.displayDetails();
		Vehicle v = new Vehicle("350", "Volvo", "Beta", 12000);
		v.displayDetails();
	}
}

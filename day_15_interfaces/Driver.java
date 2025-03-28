package day_15_interfaces;

public class Driver {
	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.start();
		b.print();
	}
}

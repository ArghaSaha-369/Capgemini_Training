package day_13_accessModifiers;

public class Car extends Vehicle {
	private int numberOfDoor;
	public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, int numberOfDoor) {
		super(vehicleNumber, brand, model, rentalPricePerDay);
		this.numberOfDoor=numberOfDoor;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" "+ this.numberOfDoor);
	}
}

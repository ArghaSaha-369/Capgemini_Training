package day_13_accessModifiers;

public class Bike extends Vehicle{
	private boolean hasGear;
	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay);
		this.hasGear=hasGear;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" "+this.hasGear);
	}
}

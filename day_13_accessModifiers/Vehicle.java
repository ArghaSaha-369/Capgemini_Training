package day_13_accessModifiers;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay) {
		this.vehicleNumber=vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
	public void displayDetails() {
		System.out.print(this.vehicleNumber+"  "+ this.brand+ " "+this.model+" "+this.rentalPricePerDay);
	}
}

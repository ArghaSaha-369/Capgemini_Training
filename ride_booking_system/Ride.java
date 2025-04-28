package ride_booking_system;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	public Ride(Customer customer, Driver driver, String status) {
		this.customer=customer;
		this.driver = driver;
		this.status = "Booked";
	}
	
	void completeRide() {
		this.status = "Completed";
		driver.setAvailable(true);
	}
	
	String getStatus() {
		return this.status;
	}
	
	String rideDetails() {
		return customer.name +" "+ driver.name +" "+ this.status;
	}
}

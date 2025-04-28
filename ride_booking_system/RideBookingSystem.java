package ride_booking_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {
	List<Customer>customers = new ArrayList<>();
	List<Driver> drivers = new ArrayList<>();
	List<Ride> rides = new ArrayList<>();
	
	public void registerCustomer (Customer customer) {
		customers.add(customer);
	}
	
	public void registerDriver (Driver driver) {
		drivers.add(driver);
	}
	
	public Ride bookRide(Customer customer) throws Exception {
		Optional<Driver> availableDriver = drivers.stream().filter(driver -> driver.isAvailable() == true).findFirst();
		if(availableDriver.isPresent()) {
			Ride ride = new Ride(customer, availableDriver.get(), "Booked");
			rides.add(ride);
			availableDriver.get().setAvailable(false);
			return ride;
		} else {
			throw new InvalidRideException("Driver Not Found");
		}
	}
}

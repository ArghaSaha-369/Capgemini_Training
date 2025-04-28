package ride_booking_system;

public class Driver extends User{
	private boolean available = true;
	
	public Driver(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
		available = true;
	}

	@Override
	void showProfile() {
		// TODO Auto-generated method stub
		System.out.println("Availability of " + name + " =" + isAvailable());
	}
	
	public boolean isAvailable() {
			return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;	
	}
	
	
}

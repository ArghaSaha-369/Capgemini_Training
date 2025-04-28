package ride_booking_system;

public class Customer extends User{
	
	public Customer(String id, String name) {
		super(id, name);
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void showProfile() {
		System.out.println(name);
	}
}

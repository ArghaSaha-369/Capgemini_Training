package day_16_task;

public class Bike extends AbstractVehicle{
	
	@Override
	public void displayType() {
		System.out.println("Bike Type: EV");
	}
	
	@Override
	public void start() {
		System.out.println("Bike started");
	}
	
	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}
	
	public Bike(String name, int speed) {
		super(name, speed);
	}
}


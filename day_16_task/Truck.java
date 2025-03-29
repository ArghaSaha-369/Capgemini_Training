package day_16_task;

public class Truck extends AbstractVehicle{
	
	@Override
	public void displayType() {
		System.out.println("Truck Type: EV");
	}
	
	@Override
	public void start() {
		System.out.println("Truck started");
	}
	
	@Override
	public void stop() {
		System.out.println("Truck stopped");
	}
	
	public Truck(String name, int speed) {
		super(name, speed);
	}
}


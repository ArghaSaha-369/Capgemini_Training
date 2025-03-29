package day_16_task;

public class Car extends AbstractVehicle{
	
	@Override
	public void displayType() {
		System.out.println("Car Type: EV");
	}
	
	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public Car(String name, int speed) {
		super(name, speed);
	}
}

package day_16_task;

public abstract class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed;
	public AbstractVehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	void displaydetails() {
		System.out.println(this.name+" "+this.speed);
	}
	
	@Override
	public void accelerate(int increment) {
		System.out.print("After Speed Incremented by "+ increment+"\n Speed Now: ");
		System.out.println(this.speed +=increment);
	}
	
	@Override
	public void brake(int decrement) {
		System.out.print("After Speed Decremented by "+ decrement+"\n Speed Now: ");
		System.out.println(this.speed -= decrement);
	}
	
	@Override
	public void getCurrentSpeed() {
		System.out.println(this.speed);
	}
	
	
}

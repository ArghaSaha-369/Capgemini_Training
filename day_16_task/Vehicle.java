package day_16_task;

public interface Vehicle {
	void start();
	void stop();
	void accelerate(int increment);
	void brake(int decrement);
	void getCurrentSpeed();
	void displayType();
}

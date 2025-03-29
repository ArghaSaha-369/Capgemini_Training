package day_16_task;

public class VehicleTest {
	public static void main(String[] args) {
		AbstractVehicle v1 = new Car("Audi", 120);
		v1.start();
		v1.accelerate(30);
		v1.brake(10);
		v1.stop();
		v1.displaydetails();
		
		System.out.println("\n----------------------------------------------------------\n");
		AbstractVehicle v2 = new Bike("Yamaha", 60);
		v2.start();
		v2.accelerate(40);
		v2.brake(20);
		v2.stop();
		v2.displaydetails();
		
		System.out.println("\n----------------------------------------------------------\n");
		AbstractVehicle v3 = new Truck("The Roadrunner", 140);
		v3.start();
		v3.accelerate(40);
		v3.brake(20);
		v3.stop();
		v3.displaydetails();
	}
}



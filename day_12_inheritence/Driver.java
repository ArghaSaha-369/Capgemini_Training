package day_12_inheritence;

import day_12_methodChaining.Student;

public class Driver {
	public static void main(String[] args) {
		Bike bike = new Bike("Kawasaki","Yamaha");
		Car car = new Car("Audi","Audi-Special-Engine", 4500000);
		
		car.display();
		bike.display();
		System.out.println(car.price);
	}
}

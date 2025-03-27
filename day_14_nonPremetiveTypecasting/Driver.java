package day_14_nonPremetiveTypecasting;

public class Driver {
	public static void main(String[] args) {
		Animal dogAnimal = new Dog("Siberian Husky");
		dogAnimal.sound();
		
		String dogBreed = ((Dog)dogAnimal).breed;
		System.out.println(dogBreed);
		dogAnimal.sound();
		System.out.println("-----------------------------");
		Animal tigerAnimal = new Tiger();
		tigerAnimal.sound();
	}
}

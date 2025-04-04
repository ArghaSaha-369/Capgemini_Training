package day_20_comparibleAndComparatorInterface;

import java.util.Arrays;

public class Dog implements Comparable {
	String name;
	int age;
	String breed;
	
	Dog(String name, int age, String breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age+" "+this.breed;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog d = (Dog)o;
		if( this.name.compareTo(d.name)!= 0) {
			return this.name.compareTo(d.name);
		}
		if(this.age - d.age != 0) {
			
			return this.age - d.age;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Dog[] d = new Dog[3];
		Dog d1 = new Dog("Kunal", 48, "TMC");
		Dog d2 = new Dog("Abhishek", 35, "TMC");
		Dog d3 = new Dog("Partha", 65, "TMC");
		
		d[0] = d1;
		d[1] = d2;
		d[2] = d3;
		
		CompareByBreed c = new CompareByBreed();
		
		Arrays.sort(d, c);
		
		
		
		
		for(Dog i : d) {
			System.out.println(i);
		}
		
	
	}
}

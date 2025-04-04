package day_20_comparibleAndComparatorInterface;

public class Person implements Comparable{
	int age;
	String name;
	
	public String toString() {
		return this.age + " "+ this.name;
	}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person)o;
		if( this.name.compareTo(p.name)!= 0) {
			return this.name.compareTo(p.name);
		}
		if(this.age - p.age != 0) {
			return this.age - p.age;
		}
		return 0;
	}
}

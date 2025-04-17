package day_30_hashSet;

import java.util.Objects;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return name + " " + id;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		// return this id=s.id &ã this name.equals(s.name);
		return this.id == s.id && Objects.equals(name, s.name);
	}

	public int hashCode() {
		return Objects.hash(id, name);
	}
}

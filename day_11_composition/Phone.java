package day_11_composition;

public class Phone {
		String phoneName;
		Battery b;
		public Phone(String phoneName, String type) {
			this.phoneName = phoneName;
			this.b = new Battery (type);
		}
		public void display() {
			System.out.println(phoneName+ " "+b.type);
		}
}

package day_9;

public class AccessVariableP2 {
	public static void main(String[] args) {
		AccessVariableP2 d = new AccessVariableP2();
	}
	
	public AccessVariableP2() {
		System.out.println(AccessVariableP1.id);
		AccessVariableP1 d = new AccessVariableP1();
		System.out.println(d.name);
	}
}

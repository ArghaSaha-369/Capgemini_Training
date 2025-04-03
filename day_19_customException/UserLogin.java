package day_19_customException;

public class UserLogin {
	private int pin = 1234;
	
	public void login(int pin) throws InvalidPinException {
		if(this.pin == pin) {
			System.out.println("User successful logged in");
		}
		else {
			throw new InvalidPinException("The user pin is invalid");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		UserLogin user = new UserLogin();
		try {
			user.login(1234);
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}
}

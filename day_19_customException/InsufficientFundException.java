package day_19_customException;

public class InsufficientFundException extends RuntimeException{
	String message;
	
	public InsufficientFundException(String message) {
//		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

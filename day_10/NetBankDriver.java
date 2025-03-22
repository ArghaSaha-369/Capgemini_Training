package day_10;

public class NetBankDriver {
	public static void main(String[] args) {
		NetBank a = new NetBank();
		a.getBalance(1234);
		a.withdraw(2000, 1234);
		a.getBalance(1234);
	}
}

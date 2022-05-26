package check;

public class Account {
	private int balance;
	
	Account(){}
	
	void setBalance(int balance) {
		if(balance <= 1000000 && balance >= 0) {
			this.balance = balance;
		} else {
		}
	}
	
	int getBalance() {
		return balance;
	}
}

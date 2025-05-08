

public class BankAccount {
	int amount;
	int getAvailable() {
	 return this.amount;	//Here 10000 will be returned
	}
	void amount(int amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
		
		OverdraftedAccount oda = new OverdraftedAccount();
		oda.amount(10000);
		oda.LA(200, 100); // overdraftLimit, overdraftAmount
		System.out.print("Final Balance: "+oda.getAvailable());
	}

}
class OverdraftedAccount extends BankAccount
{
	int overdraftLimit; // amount of money the account holder can borrow from the account - the amount the account balance can go negative 
	int overdraftAmount; // the amount of money already  borrowed against the account
	
	int getAvailable() {
		int available =  super.getAvailable()+ this.overdraftLimit;// 10000 + 200 =10200
		return (available - this.overdraftAmount); // 10200 - 100 = 10100
		
	}
	void LA(int a, int b) {
		this.overdraftLimit = a;
		this.overdraftAmount = b;
	}
}

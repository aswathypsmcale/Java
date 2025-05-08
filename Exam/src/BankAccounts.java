
 class BankAccounts
{
	 public static void main(String[] args)
		{
			// TODO Auto-generated method stub

			  BankAccounts b=new BankAccounts();
			  b.getAvailable();
			  OverdraftedAccount o=new OverdraftedAccount();
			  o.getAvailable();
		}

	int balance=80000;
	public void getAvailable()
	{
		System.out.println("The avalable fund in the account is:"+balance);
	}
}
	 class OverdraftedAccount extends BankAccounts
	{
		int overdraftlimit=30000;
		int overdraftammount=5000;
		public void getAvailable()
		{
			balance=balance+overdraftlimit-overdraftammount;
			System.out.println("Return the amount of fund available="+balance);
		}
	
		

}


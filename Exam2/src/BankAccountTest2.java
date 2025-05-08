

class BankAccount
{

    private String accountNum; // the account number
    private double balance;	   // the amount on deposit
    private final double RATE = 0.035; 
   
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

    public void deposit(double amount)	
    {
        double newBalance = balance + amount;
        balance = newBalance;							
    }

    public void withdraw(double amount)	
    {
        double newBalance = balance - amount;
        balance = newBalance;			
    }

    public String getAccount()	
    {
        return accountNum;		
    }

    public double getBalance()	
    {
        return balance;			
    }

   
    public void SavingsAccount(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }

    public void CheckingAccount(BankAccount destination, double amount)
    {
        destination.deposit(amount);	
        this.withdraw(amount);           // withdraw from this account
    }
    public double addInterest ()
    {
        balance += (balance * RATE);
        return balance;
    }
}

public class BankAccountTest2
{

    public static void main(String[] args)
    {
        
        BankAccount mom = new BankAccount("102030405060", 0.5);
        BankAccount son = new BankAccount("2222222", 100);

        System.out.println("Mom's Account:.............");
        System.out.printf("Account Number :: %s ,initial balance = $%.2f%n ",mom.getAccount(), mom.getBalance());
        System.out.println("Son's's Account:.............");
        System.out.printf("AccountNumber :: %s ,initial balance = $%.2f%n ",son.getAccount(), son.getBalance());
          mom.deposit(10000);
          System.out.printf("Mom's initial Deposit 10000",
                  mom.getAccount(), mom.getBalance());
          System.out.printf("\n Account %s has new balance of $%.2f%n",
                  mom.getAccount(), mom.getBalance());
         mom.SavingsAccount(son, 2000);
          System.out.println("\n mom transferFunds 2000 ...");
          System.out.printf("Account %s has new balance of $%.2f%n",
                  mom.getAccount(), mom.getBalance());

          System.out.printf("Account %s has new balance of $%.2f%n",
                  son.getAccount(), son.getBalance());
          son.withdraw(1500);
          System.out.println("\n son withdraw 1500..");
          System.out.printf("Account %s has new balance of $%.2f%n",
                  son.getAccount(), son.getBalance());
          son.withdraw(500);
          // print new balances
          System.out.println("after withdraw 500...");
          System.out.printf("Account %s has new balance of $%.2f%n",
                  son.getAccount(), son.getBalance());

          
        // print new balances
          mom.SavingsAccount(son, 1000);
        System.out.println("\n mom transferFunds 1000...");
        System.out.printf("Account %s has new balance of $%.2f%n",
                mom.getAccount(), mom.getBalance());

        System.out.printf("Account %s has new balance of $%.2f%n",
                son.getAccount(), son.getBalance());

       
       son.withdraw(400);
        // print new balances
        System.out.println("son after withdraw 400...");
        System.out.printf("Account %s has new balance of $%.2f%n",
                son.getAccount(), son.getBalance());

        
        

        // print new balancesS
        System.out.println("\n moms balance ...");
        System.out.printf("Account %s has new balance of $%.2f%n",
                mom.getAccount(), mom.getBalance());
        System.out.println("\n sons balance ...");
        System.out.printf("Account %s has new balance of $%.2f%n",
                son.getAccount(), son.getBalance());
    }
}
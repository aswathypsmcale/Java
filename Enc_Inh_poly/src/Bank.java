
//consider the following bank account class with deposit and show balance methods?
import java.util.Scanner;
public class Bank 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     BankDetails B=new BankDetails();
     B.openAccount();
     B.showAccount();
     
	}

}
class BankDetails
{   
	private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() 
    {  
    System.out.print("Enter Account No: ");  
    accno = sc.next();  
    System.out.print("Enter Account type: ");  
    acc_type = sc.next();  
    System.out.print("Enter Name: ");  
    name = sc.next();  
    System.out.print("Enter Balance: ");  
    balance = sc.nextLong();  
    }  
   //method to display account details  
    public void showAccount()
    {  
    System.out.println("Name of account holder: " + name);  
    System.out.println("Account no.: " + accno);  
    System.out.println("Account type: " + acc_type);  
    System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
    public void deposit() 
    {  
    long amt;  
    System.out.println("Enter the amount you want to deposit: ");  
    amt = sc.nextLong();  
    balance = balance + amt;  
   } 
}
import java.util.Scanner;
class Positive
{
	public static void main (String args[])
	{
	Scanner input=new Scanner(System.in);
	int result;
	System.out.println("Enter number:");
	int no1=input.nextInt();
	if(no1>0)
	{
	System.out.println("given number is positive");
	}
	else
	{
	System.out.println("given number is negative");	
	}
	}
}
	
	
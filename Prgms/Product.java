import java.util.Scanner;
class Product
{
	public static void main (String args[])
	{
	Scanner input=new Scanner(System.in);
	int result;
	System.out.println("Enter first number:");
	int no1=input.nextInt();
	System.out.println("Enter second number:");
	int no2=input.nextInt();
	result=no1*no2;
	System.out.println("Product of two numbers is="+result);
	}
}
	
	
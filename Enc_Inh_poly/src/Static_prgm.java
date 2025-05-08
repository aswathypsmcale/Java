
//Write a program to demonstrate static variables, methods, and blocks?

public class Static_prgm 
{
	static int num;
	static String mystr;
	static
	{
		num=100;
		mystr="Ststic keyword in java";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystring:  "+mystr);
	}
}

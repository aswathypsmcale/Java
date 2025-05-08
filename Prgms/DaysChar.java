import java.util.Scanner;
class DaysChar
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the input value:");
  char day = sc.next().charAt(0);
switch(day)
{
case 'A':
	System.out.println("sunday");
	break;
case 'B':
	System.out.println("monday");
	break;
case 'C':
	System.out.println("tuesday");
	break;
case 'D':
	System.out.println("wednesday");
	break;
case 'E':
	System.out.println("thursday");
	break;
case 'F':
	System.out.println("friday");
	break;
case 'G':
	System.out.println("saturday");
	break;
default: 
 	System.out.println("invalid");
	break;
}
}
}


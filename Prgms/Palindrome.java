import java.util.Scanner;
class Palindrome
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Input the year :");
int year=sc.nextInt();
if((year%4==0)||(year%400==0)&&(year%100!=0))
{
System.out.println("Given year is palindrome");
}
else
{
System.out.println("Given year is not an palindrome");
}
}
}
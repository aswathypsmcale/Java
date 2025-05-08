


import java.util.InputMismatchException;
import java.util.Scanner;

public class Stringopr extends Exception {
public static void main(String[] args) {

try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String s1=sc.nextLine();

System.out.println("Choose the function:");
System.out.println("1.Length");
System.out.println("2.Concatenation");
System.out.println("3.Compare");
System.out.println("4.Count the number of occurrence of character");
int n=sc.nextInt();

switch(n)
{
case 1:
	   System.out.println("Length of the String is "+s1.length());
       break;
case 2:
	    System.out.println("Enter the second string:");
        String s2=sc.next();
        System.out.println(s1+" " +s2);
        break;
case 3:
        System.out.println("Enter the String to compare");
        String s3=sc.next();
        System.out.println("After comparing,the value is "+s1.compareTo(s3));
        break;
case 4:
        System.out.println("Enter the character");
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s1.length();i++) {
        if(s1.charAt(i)==c) {
         count++;
         }
          }
         System.out.println("Number of occurrence of "+c+" is "+count);
         break;
         }
          }
catch(InputMismatchException e) {
            System.out.println(e);}
          }

}
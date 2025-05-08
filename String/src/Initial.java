/*Write a program that computes your initials from your full name and displays them.*/

import java.util.*;
public class Initial
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first name:");
String a=sc.next();
 /*
System.out.println("enter last name:");
String b=sc.next();
StringBuffer obj=new StringBuffer(a);
StringBuffer obj2=new StringBuffer(b);
char c=obj.charAt(0);
char d=obj2.charAt(0);
System.out.print(c);
System.out.print(d);*/

//trims the trailing and leading spaces

System.out.println(a.trim());

// trims the leading spaces
a = "  ";
System.out.println(a.trim());

}

}


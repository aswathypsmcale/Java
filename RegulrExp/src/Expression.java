

import java.util.regex.Pattern;
import java.util.Scanner;

public class Expression{

public static void main(String[] args){

String address="";

Scanner sc=new Scanner(System.in);
System.out.println("Enter the address");
address=sc.nextLine();
if(Pattern.compile("^www").matcher(address).find()==true)
{
String str="http://".concat(address);
System.out.println(str);
}
else
System.out.println("Not an address");
}
}

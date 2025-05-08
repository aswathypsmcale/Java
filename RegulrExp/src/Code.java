
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Code
{
public static void main(String args[])
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter the area code");
int areaCode=sc.nextInt();
System.out.println("Enter the exchange code");
int exchange=sc.nextInt();
System.out.println("Enter the last four digits");
int lastFour=sc.nextInt();

String s1=String.valueOf(areaCode);
String s2=String.valueOf(exchange);
String s3=String.valueOf(lastFour);

if(Pattern.matches("[0-9]{3}", s1))
{
if(Pattern.matches("[0-9]{3}", s2))
{
if(Pattern.matches("[0-9]{4}", s3))
{
System.out.println(s1+"-"+s2+"-"+s3);
}
}
}
else
System.out.println("Invalid codes");

}
}
import java.util.Scanner;
class ReverseString
{
 public static void main(String args[])
 {
   String str,temp="";
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter string:");
   str=sc.nextLine();
   int l=str.length();
   for(int i= l-1;i>=0;i--)
{
 temp=temp+str.charAt(i);
}
if(str.equals(temp))
{
 System.out.println("String is palindrome="+temp);
}
else
{
 System.out.println("String is not palindrome="+temp);
}}}
   

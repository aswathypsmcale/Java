import java.util.Scanner;
class PalindromeN
{
public static void main(String args[])
{
  int i,n,d,rev=0,temp=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter number:");
 n=sc.nextInt();
temp=n;
while(n>0)
{
  d=n%10;
  n=n/10;
 rev=rev*10+d;
}
 if(temp==rev)
{
System.out.println("pallindrome  "+rev);
}
else
{
 System.out.println("notpalindrome  "+rev);
}
}
}

 
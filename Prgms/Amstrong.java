import java.util.*;
class Amstrong
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int rev=0,n,d,i;
 System.out.println("Enter the number:");
 n=sc.nextInt();
i=n;
while(n>0)
{
d=n%10;
n=n/10;
rev+=d*d*d;
}
if(i==rev)
{
System.out.println("Given number is amstrong"+rev);
}
else
{
System.out.println("Given number is not amstrong" +rev);
}
}
}
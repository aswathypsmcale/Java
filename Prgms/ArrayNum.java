import java.util.Scanner;
class ArrayNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,sum=0;

System.out.println("Enter limit");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();
sum=sum+a[i];
 }
System.out.println("sum="+sum);
}

}
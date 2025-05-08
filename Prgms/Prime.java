import java.util.Scanner;
class Prime
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n,i,flag=0;
  System.out.println("Enter the number:");
  n=sc.nextInt();

  if(n==0||n==1)
{
  System.out.println("Given number"+ n +"is  not prime");
}

else 
{
for(i=2;i<n;i++)

{
    if(n%i==0)
{
    System.out.println("Given number"+ n +"is  not prime");
    flag=1;
 }
 }
 }
 if(flag==0)
 {
  System.out.println("Given number"+ n +"is   prime");

 }
}
}
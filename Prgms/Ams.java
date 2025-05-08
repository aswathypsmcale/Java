//Amstrong number

import java.util.Scanner;
class Ams
{
 public static void main(String args[])
{
int i,d,result=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number:");
 int n= sc.nextInt();
  i=n;
  while(n>0)
{
   d=n%10;
   n=n/10;
   result+=d*d*d;
}
if(i==result){
System.out.println("Given number is Amstrong:  "+ result);
}
else
{
System.out.println("Given number is not Amstrong:  "+result);
}
}
}
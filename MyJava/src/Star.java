

public class Star
{
 public static void main(String[] args)
 {
  int i, j;
  for(i=1; i<=5; i++)
  {
   for(j=1; j<=i; j++)
    System.out.print("*");
   System.out.println();
  }
  int m, n;
  for(m=5; m>=1; m--)
  {
   for(n=1; n<=m; n++)
    System.out.print("*");
   System.out.println();
  }
  System.out. println();
  System.out. println();
  System.out. println();
  int a, b, k;
  for(a=1; a<=5; a++) 
  {
   for(b=a; b<5; b++)
    System.out.print(" ");
   for(k=1; k<a*2; k++)
    System.out.print("*");
   System.out.println();
  }
 }
}

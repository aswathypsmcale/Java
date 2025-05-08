

import java.util.Scanner;
public class Fibonacci
{
 public static void main(String[] args)
 {
  Scanner reader = new Scanner(System.in);
  int a = 0;
  int b = 1;
  int c = a + b;
  
  System.out.print("Enter a (int) limit: ");
  int limit = reader.nextInt();
  
  System.out.format("\nFibonacci series upto %d: \n", limit);
  System.out.format("%d %d ", a, b);

  while(c <= limit)
  {
   System.out.print(c +" ");
   a = b;
   b = c;
   c = a + b;
  }
 }
}
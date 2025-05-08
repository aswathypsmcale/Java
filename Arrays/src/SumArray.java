

public class SumArray
{
 public static void main(String[] args)
 {
  int i, sum = 0;
  int[] arr = {1, 2, 3, 4, 5};

  for(i=0; i<5; i++)
   sum += arr[i]; 
  
  System.out.format("Sum of array: %d\n", sum);
 }
}
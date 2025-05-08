

public class MatrixAddition
{
 public static void main(String[] args)
 {
  int i, j;
  int[][] arr1 = {
   {1, 1, 1},
   {1, 1, 1},
   {1, 1, 1}
  };
  int[][] arr2 = {
   {2, 2, 2},
   {2, 2, 2},
   {2, 2, 2}
  };
  int[][] arr3 = new int[3][3];

  System.out.println("Matrix A (3 x 3):");
  for(i=0; i<3; i++)
  {
   for(j=0; j<3; j++)
    System.out.format("%d ", arr1[i][j]);
   System.out.println();
  }
  
  System.out.println("\nMatrix B (3 x 3):");
  for(i=0; i<3; i++)
  {
   for(j=0; j<3; j++)
    System.out.format("%d ", arr2[i][j]); 
   System.out.println("");
  }

  System.out.println("\nMatrix Additon (A + B):");
  for(i=0; i<3; i++)
  {
   for(j=0; j<3; j++)
   {
    arr3[i][j] = arr1[i][j] + arr2[i][j];
    System.out.format("%d ", arr3[i][j]);
   }
   System.out.println();
  }
 }
}
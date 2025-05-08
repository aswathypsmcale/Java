/*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
 respectively by creating a class named 'Rectangle' with a method named 'Area' which returns
 the area and length and breadth passed as parameters to its constructor.?*/


public class Rectangle 
{
	public static void main(String[] args)
	{
		int length,breadth;
		// TODO Auto-generated method stub
      Rectangle1 R1=new Rectangle1(4,5);
       Rectangle1 R2=new Rectangle1(5,8);
       System.out.println("Area ="+R1.getarea()+"perimeter = "+R1.getperimeter());
       System.out.println("Area = "+R2.getarea()+"Perimeter ="+R2.getperimeter());
	}
}
	 class Rectangle1
	 {
		 int length,breadth;
	 
	   Rectangle1(int a,int b)
	  {
		  length=a;
		   breadth=b;
	  }
	   public int getarea()
	   {
		   return length*breadth;
	   }
	   public int getperimeter()
	   {
		   return 2*(length+breadth);
	   }

	
}
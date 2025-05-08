/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
creating a class named 'Triangle' without any parameter in its constructor.?*/

public class TriangleWP {
  
	
	 TriangleWP()
	{
		 int a=3;
			int b=4;
			int c=5;
		
		int s=(a+b+c)/2;
        double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
			System.out.println("Perimeter of a triangle="+s);
			System.out.println("Area of a Triangle="+area);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
          TriangleWP TP=new TriangleWP(); 
         
	}

}

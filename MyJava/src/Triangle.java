/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
creating a class named 'Triangle' with constructor having the three sides as its parameters.*/


public class Triangle {
	 
	int a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle AP=new Triangle(3,4,5);

	}
	Triangle(int a,int b,int c)
	{
		int s=(a+b+c)/2;
        double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Perimeter of a triangle="+s);
		System.out.println("Area of a Triangle="+area);
	}

}

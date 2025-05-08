/*Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named area() and volume(). Create these using polymorphism concepts. ?*/


public class Poly_Shape {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Square s1=new Square();
		s1.area();
		s1.volume();
		Circle c1=new Circle();
		c1.area();
		c1.volume();
		Triangles T1=new Triangles();
		T1.area();
		T1.volume();	

	}

}
 class Shape
{  
int length=10,breadth=5,height=8,radius=10;
}  
class Square extends Shape
{  
void area()
{
  double S_Area=length*breadth;	

	System.out.println("Area of square is :"+S_Area); 
}
void volume()
{
	System.out.println("No volume in square");
}
}
class Circle extends Shape
{
void area()
{
	double C_Area=3.14*radius*radius;
	System.out.println("Area of Circle:"+C_Area); 
}
void volume()
{
System.out.println("No volume in circle");
}
}
class Triangles extends Shape
{  
	void area()
	{
		
		double T_Area=length*breadth*height*0.5;
		System.out.println("Area of Triangle :"+T_Area); 
	}
	void volume()
	{
		System.out.println("no volume in Triangle");
	}
}

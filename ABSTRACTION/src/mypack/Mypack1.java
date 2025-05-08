package mypack;

public class Mypack1 {
	static double py=3.14;
	public void area(int r)
	{
	double area=py*r*r;
	System.out.println("Area of the circle is "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypack1 c=new Mypack1();
		c.area(10);

	}

}

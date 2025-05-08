

interface I1
{
	int x = 0;
	public void add();
	public void subtract();
}
interface I2 
{
	int y = 0;
	public void multiply();
	public void divide();
}
public class Pack1 implements I1,I2
{
	int x;
	int y;
	Pack1(int a, int b) 
	{
		this.x = a;
		this.y = b;
	}
	public void add()
	{
		System.out.println(this.x+this.y);
	}
	
	public void subtract()
	{
		System.out.println(this.x-this.y);
	}
	
	public void divide()
	{
		System.out.println(this.x/this.y);
	}
	
	public void multiply()
	{
		System.out.println(this.x*this.y);
	}
	
	public static void main(String args[])
	{
		Pack1 c = new Pack1(10, 5);
		c.add();
		c.subtract();
		c.divide();
		c.multiply();
	}
}
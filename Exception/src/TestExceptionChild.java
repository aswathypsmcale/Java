//CHECKED EXCEPTION
import java.io.*;
class Parent
{
void msg()
{
	System.out.println("parent");
}
}
public class TestExceptionChild extends Parent
{
	void msg() throws IOException
	{
		System.out.println("TestExceptionChild");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Parent p=new TestExceptionChild();
     p.msg();
	}

}




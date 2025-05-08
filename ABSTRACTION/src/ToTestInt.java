/*Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of
arithmetic class. ?*/

 class ToTestInt
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Test obj=new Arithmetic1();
     obj.square(5);
	}

}
interface Test
{
	void square(int a);
}	
	
	class Arithmetic1 implements Test
	{
		public void square(int a)
		{
			int sqt=a*a;
			System.out.println("SQUARE:"+sqt);
		}
	}



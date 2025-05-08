/*Write a java program to implement generic class and generic methods?*/

class Test<T>
{
	// An object of type T is declared
	T obj;
	Test(T obj) // constructor
	{
		this.obj=obj;
	}
	public T getobject()
	{
		return this.obj;
	}
	public<sample> void Method1(sample a)
	{
		System.out.println("Method 1 print"+a);
	}
}
public class Generic1 {

	public static void main(String[] args) 
	{
		
		// instance of Integer type
   Test <Integer>iobj=new Test<Integer>(10);
   System.out.println(iobj.getobject());
   
   Test<String>sobj=new Test<String>("ASWATHY");
   System.out.println(sobj.getobject());
   
   sobj.Method1("hello");
	}

}



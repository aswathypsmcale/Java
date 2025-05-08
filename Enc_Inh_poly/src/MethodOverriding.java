//Write a program to give the example for method overriding concepts. 

class method
{
	void display()
	{
		System.out.println("Method overriding  in parent class");
	}
}
public class MethodOverriding extends method{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj=new MethodOverriding();
	    obj.display();
	    method  obj2=new method();
	    obj2.display();
}
		void display()
		{
			System.out.println("method overriding in child class");
		}

		    

}

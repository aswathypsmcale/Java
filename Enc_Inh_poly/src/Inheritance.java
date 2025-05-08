//Create class named as ‘a’ and create a sub class ‘b’. Which is extends from class ‘a’. And use these classes in ‘inherit’ class. ?
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b obj=new b();
		obj.title();
		obj.display();
		
		
	}

}
class a
{
	int id=101;
	String name="Nikhil";
	
	void title()
	{
		System.out.println("Employee Details");
	}
}
class b extends  a
{
	 String company="ABC";
	 int salary=5000;
	  void display()
	  {
		  System.out.println("Employee Id="+id);
		  System.out.println("Employee name="+name);
		  System.out.println("Company ="+company);
		  System.out.println("Salary ="+salary);
	  }
	 
}
/*Create an outer class with a function display, again create another class
inside the outer class named inner with a function called display and call
the two functions in the main class. ?*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
		oc.display();
		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.display();

	}

}
class OuterClass
{
void display()
{
System.out.println("Inside Outer Class");
}
class InnerClass
{
void display()
{
System.out.println("Inside Inner Class");
}
}
}

//Write a program to give example for multiple inheritance in Java. ?
interface display
{
	void print();
}
interface screen extends display
{
	void show();
}
public class MultipleInheritance implements screen
{
    public void print()
    {
    	System.out.println("Hello");
    }
    public void show()
    {
    	System.out.println("Welcome");
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.print();
		obj.show();
	}

}

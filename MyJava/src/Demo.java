abstract class MyClass{
public void disp(){
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
public class Demo extends MyClass{
	public void disp2()
	{
	System.out.println("overriding abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.disp2();
		//obj.disp();
	}

}





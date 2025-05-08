
public interface Abc {
	void disp();
	void sum(int i);
	void salary(int j);
}
class Project implements Abc
{
	String name;
	int amount;
	int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 obj=new Client1();
		obj.disp();
		Client2 obj2=new Client2();
		obj2.salary(10000);
		obj2.sum(15000);
		
	}

}

class Client1 extends Project
{
	public void disp()
	{
		System.out.println("client1");
	}
}
class Client2 extends Project
{
	public void sum(int x)
	{
		System.out.println(x);
	}
	public void salary(int a)
	{
		System.out.println(a);
	}
}


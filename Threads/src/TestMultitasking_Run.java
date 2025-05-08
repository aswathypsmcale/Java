
public class TestMultitasking_Run implements Runnable 
{
	public void run()
	{
		System.out.println("Task one");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t1=new Thread(new TestMultitasking_Run ());
		Thread t2=new Thread(new TestMultitasking_Run ());
		t1.start();
		t2.start();

	}

}

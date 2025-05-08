
public class Thread1 extends Thread 
{
	public void run()
	{
		System.out.println("Task one");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		Thread1 t3 = new Thread1();
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}

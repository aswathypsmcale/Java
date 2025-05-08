/*create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class.
 A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. 
Start() invokes the run() method on the Thread object.

*/

class ABC extends Thread
{
	public void start()
	{
		System.out.println("this is start method");
		
	}
	public void run()
	{
		System.out.println("This is run method");
	}
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ABC obj=new ABC();
  obj.start();
 // obj.run();
  System.out.println("main method");
	}

}

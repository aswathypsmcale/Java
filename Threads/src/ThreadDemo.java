

class ThreadDemo extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
try
{
	Thread.sleep(1000);
}
catch(InterruptedException e)
{
	System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[]){
ThreadDemo t1=new ThreadDemo();
ThreadDemo t2=new ThreadDemo();
t1.start();
t2.start();
}
}

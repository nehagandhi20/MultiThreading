package thread.basics;
import java.lang.*;


public class ThreadCreationDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
	}

	public static void main(String s[])
	{
	ThreadCreationDemo myThread = new ThreadCreationDemo();
		myThread.start();
		System.out.println("current thread is " + myThread.getName());
	
	}
}
	
	
	



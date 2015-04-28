package thread.basics;

public class ThreadRunnable implements Runnable
{
	
	public void run()
	{
		System.out.println("Runnable thread is running - " + Thread.currentThread());
	}
	
	

	public static void main(String[] args) 
	{
		Thread myRunnable = new Thread(new ThreadRunnable(), "Thread-Runnable");
		//myRunnable.setName("Thread-Runnable");
		myRunnable.start();
		
	
		

	}

}

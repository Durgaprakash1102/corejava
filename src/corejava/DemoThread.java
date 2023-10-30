//Program to create a Thread by extending Thread class
package corejava;

public class DemoThread extends Thread 
{
	// overriding run method
	public void run()
	{
		try
		{
			System.out.println("Thread is running : " + Thread.currentThread().getPriority());
			
			Thread.sleep(1000);// making the thread to sleep for certain time
			
		} 
		catch (InterruptedException e)
		{
			System.out.println("Thread interrupted");
		}
	}

	public static void main(String[] args)
	{

		for (int i = 0; i <= 5; i++)
		{
			DemoThread td = new DemoThread();
			
			td.start();// starting the main thread
		}
		
		
		for (int i = 0; i <= 5; i++) 
		{
			try 
			{
				// creating a new thread and creating a object for the thread class
				Thread t = new Thread(currentThread());
				
				System.out.println(Thread.currentThread().getName() + i);
				
				Thread.sleep(1000);// making the thread to sleep for certain time
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}

	}

}

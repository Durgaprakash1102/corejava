//Program to demonstrate creating a Thread by implementing Runnable interface and sleep method
package corejava;

public class DemoThread1 implements Runnable{

	// overriding run method
	public void run()
	{
		try
		{
			System.out.println("Thread Priority is: "+Thread.currentThread().getPriority());
			
			Thread.sleep(1000);// making the thread to sleep for certain time
			
			System.out.println("Name of the Thread: "+Thread.currentThread().getName());

		} 
		catch (InterruptedException e)
		{
			System.out.println("Thread interrupted");
		}
	}
	public static void main(String[] args)
	{
		// creating object for the class 
		DemoThread1 dt=new DemoThread1();
		
		Thread t=new Thread(dt,"DemoThread1Obj");//assigning the object to the thread and giving the name to the thread
		
		t.start();//starting the thread
	}


}

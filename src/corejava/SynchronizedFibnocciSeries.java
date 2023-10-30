//Program to demonstrate synchronized method for printing the fibnocci series
package corejava;

class Fibonocci 
{ 
	//synchronized method to print the Fibonocci series
	synchronized void printFibnocciSeries(int range) 
	{
		int num1 = 0, num2 = 1, num3;
		System.out.println("Fibonocci series with range "+range+":");
		System.out.print(num1 + " " + num2);
		for (int i = 0; i <= range - 2; i++) 
		{
			// logic for printing the fibonocci series
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
	}
}

class Fibonocci1 extends Thread 
{
	// Aggregation
	Fibonocci f;

	Fibonocci1(Fibonocci f) 
	{
		this.f = f;
	}

	//running the thread
	public void run()
	{
		f.printFibnocciSeries(10);
	}
}

class Fibonocci2 extends Thread 
{
	// Aggregation
	Fibonocci f;

	Fibonocci2(Fibonocci f) 
	{
		this.f = f;
	}

	//running thread thread
	public void run() 
	{
		f.printFibnocciSeries(15);
	}
}

public class SynchronizedFibnocciSeries 
{

	public static void main(String[] args)
	{
		Fibonocci f = new Fibonocci();
		Fibonocci1 f1 = new Fibonocci1(f);
		f1.start();//starting the f1 thread
		Fibonocci2 f2 = new Fibonocci2(f);
		f2.start();//starting the f2 thread

	}

}

//Program demonstrating exception handling to handle Arithmetic Exception and Array Index Out Of Bounds Exception
package corejava;

public class DemoArithmeticAndArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		//Handling Arithmetic Exception using try-catch block
		try
		{
			int a, b, c;
			a = 30;
			b = 0;
			c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Airthmetic Exception Raised");
			System.out.println(e);//printing the information of the exception occured
		}

		System.out.println("\nout of try\n");
		
		//Handling ArrayIndexOutOfBounds Exception using try-catch block
		try 
		{
			int[] arr = { 1, 2, 3, 4 };
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds Exception Raised");
			System.out.println(e);//printing the information of the exception occured
		} 
		
		//finally block which executes irrespective of the exception
		finally 
		{
			System.out.println("Under finally block");
		}
	}

}

/* program using custom Exception.
There is a government scheme for the poor people to supply rice, pulses etc. 
For this an application has to developed in which the applicants income has to be taken from different sources. 
If income is <=10000 the application will be accepted. Else the application will be rejected.*/


package corejava;

import java.util.Scanner;

//Custom Exception class i.e, IncomeExceedsException class

class IncomeExceedsException extends Exception {

	public IncomeExceedsException(String e)
	{
		super(e);
	}

}

public class RationApplication {

	// method to validate the income of the family
	public static void validateIncome(int income) throws IncomeExceedsException
	{
		if (income <= 10000)
			System.out.println("You Application is accepted");
		else
			throw new IncomeExceedsException("You Application is not accepted/Rejected");

	}

	public static void main(String[] args) {

		// Collecting the incomes of the family from different sources and finding the
		// total income
		try 
		{
			int n = 0, i, totalincome = 0;
			try (Scanner sc = new Scanner(System.in)) 
			{
				System.out.println("Enter no of income sources in the family");
				n = sc.nextInt();
				int[] incomes = new int[n];
				System.out.println("Enter the  incomes:");
				for (i = 0; i < n; i++) 
				{
					incomes[i] = sc.nextInt();
				}
				for (i = 0; i < incomes.length; i++) 
				{
					totalincome = totalincome + incomes[i];
				}
			}
			System.out.println("Your family income is:" + totalincome);
			validateIncome(totalincome);
		} 
		
		
		catch (IncomeExceedsException e) 
		{
			System.out.println("Exception:" + e);
		}

	}

}

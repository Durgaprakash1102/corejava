package corejava;

import java.util.Scanner;

public class VoteridApp {
	static void validate(int age) throws AgeException
	{
		if(age>=18)
			System.out.println("You are eligible for voter id app");
		else
			throw new AgeException("AGE NOT VALID");
	}

	public static void main(String[] args) {
		try {
			int age;
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to voter id app");
			System.out.println("Enter age of the application");
			age=sc.nextInt();
			validate(age);
		}catch(AgeException e) {
			System.out.println("Exception:"+e);
		}
		
	}

}

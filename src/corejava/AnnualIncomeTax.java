package corejava;

import java.util.Scanner;

public class AnnualIncomeTax {
	static void calculateIncometax(int income) {
		int incometax=0;
		if(income<=250000) {
			System.out.println("No tax is to be paid");	
		}
		else if(income<=500000){
			incometax=(income*10)/100;
			System.out.println("IncomeTax is:"+incometax);
			
		}
		else if(income<=1000000){
			incometax=30000+(income*20)/100;
			System.out.println("IncomeTax is:"+incometax);
			
		}
		else {
			incometax=50000+(income*30)/100;
			System.out.println("IncomeTax is:"+incometax);
		}
	}

	public static void main(String[] args) {
		String name;
		int income;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of the employee:");
		name=sc.nextLine();
		System.out.println("Enter Income of the employee:");
		income=sc.nextInt();
		System.out.println("Employee name is :"+name);
		calculateIncometax(income);
		
	}

}

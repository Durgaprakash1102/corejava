package corejava;

import java.util.Scanner;

public class SumFirstAndSecondLastDigit {

	public static void main(String[] args) {
		int number,temp,sum=0;
		int[] digits=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 5 digit number:");
		number=sc.nextInt();
		for(int i=4;i>=0;i--) {
			temp=number%10;
			number=number/10;
			digits[i]=temp;
		}
		sum=sum+digits[0]+digits[3];
		System.out.println("Sum of first digit and second last digit in the given 5-digit number is:"+sum);
	}

}

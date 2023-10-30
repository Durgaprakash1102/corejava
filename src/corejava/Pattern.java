/* Program to print the pattern
1
1 2
1 2 3
1 2 3 4 
1 2 3 4  5
*/
package corejava;

import java.util.Scanner;

public class Pattern {
	// function to print right angled triangle pattern
	static void printPattern(int n) {
		int i, j;
		for (i = 1; i <= n; i++) { // to print elements of one row
			// for (i = n; i >=1; i--){ // to print elements of one row in reverse order
			for (j = 1; j <= i; j++) {// each element will be printed in a row
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		int number;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no.of for pattern:");
			number = sc.nextInt();
		}
		printPattern(number);

	}

}

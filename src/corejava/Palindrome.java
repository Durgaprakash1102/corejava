//Program to check whether the string is palindrome or not
package corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str, reverse = "";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String:");
			str = sc.nextLine();
		}
		int n = str.length();// calculating the length of the string

		// logic for reversing the string
		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		if (str.equals(reverse)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

}

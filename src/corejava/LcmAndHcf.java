//Program to find the LCM and HCF of two numbers
package corejava;

public class LcmAndHcf {
	// function to calculate LCM and HCF
	static void calc(int num1, int num2) {
		int i, result1 = 1;
		for (i = 2; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				result1 = i;
		}
		int result2 = (num1 * num2) / result1;
		System.out.println("HCF= " + result1);
		System.out.println("LCM= " + result2);
	}

	public static void main(String[] args) {
		calc(10, 12);

	}

}

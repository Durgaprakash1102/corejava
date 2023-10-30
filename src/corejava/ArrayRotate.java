//Program to rotate array elements in a clockwise direction
package corejava;

public class ArrayRotate {

	public static void main(String[] args) {
		int[] myarr = { 1, 2, 3, 4, 5 };
		int temp1, temp2, i;

		// printing array elements before rotation
		System.out.println("Array before rotation:");
		for (i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}

		// logic for rotating array elements
		temp1 = myarr[0];
		for (i = 1; i < myarr.length; i++) {
			temp2 = myarr[i];
			myarr[i] = temp1;
			temp1 = temp2;
		}
		myarr[0] = temp1;

		// printing array elements after rotation
		System.out.println("\nArray after rotation:");
		for (i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}
	}

}

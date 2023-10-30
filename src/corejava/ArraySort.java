//program to sort the array elements
package corejava;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 5, 8 };
		System.out.println("Array length is:" + arr.length);
		int i, j, temp = 0;

		// printing array elements before sorting
		System.out.println("Array elements before sorting: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// sorting the array in ascending order
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		// Printing Array elements after sorting in ascending order
		System.out.println("Array elements after sorting in ascending order: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// sorting the array in descending order
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		// Printing Array elements after sorting in descending order
		System.out.println("Array elements after sorting in descending order: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

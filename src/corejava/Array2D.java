//program demonstarting addition and subtraction using 2D arrays
package corejava;

public class Array2D {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] sum = new int[3][3];
		int[][] diff = new int[3][3];
		int i, j;
		
		System.out.println("Addition of arrays:");
		// adding elements of two arrays
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		// printing the sum array
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		// subtracting elements of two arrays
		System.out.println("Subtraction of arrays:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				diff[i][j] = a[i][j] - b[i][j];
			}
		}
		
		// printing the sum array
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(diff[i][j] + " ");
			}
			System.out.println();
		}
	}

}

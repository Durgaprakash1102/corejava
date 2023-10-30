package corejava;

public class ArrayMultiplication {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 3, 1 }, { 2, 1, 2 }, { 3, 4, 3 } };
		int[][] mul = new int[3][3];
		int i, j, k;

		System.out.println("Multiplication of two Arrays:");
		// logic for multiplication of two arrays
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				mul[i][j] = 0;
				for (k = 0; k < 3; k++) {
					mul[i][j] += a[i][k] * b[k][j];
				}

			}
		}

		// printing the array after multiplication
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}

}

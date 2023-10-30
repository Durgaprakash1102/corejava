package corejava;

public class ArrayComparision {

	public static void main(String[] args) {
		int[] first = { 2, 3, 6, 8 };
		int[] second = { 4, 6, 3, 2 };
		boolean equal = true;
		if (first.length == second.length) {
			for (int i = 0; i < first.length; i++) {
				if (first[i] != second[i]) {
					equal = false;
					break;
				}  
			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("First and Second arrays are equal");

		} else {
			System.out.println("First and Second arrays are not equal");
		}

	}
}

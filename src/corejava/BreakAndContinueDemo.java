//Program on Break and Continue

package corejava;

public class BreakAndContinueDemo {

	public static void main(String[] args) {
		int i;
		System.out.println("Continue");
		for (i = 1; i <= 10; i++) {
			if (i % 5 == 0)
				continue;
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Break");
		for (i = 1; i <= 10; i++) {
			if (i == 10)

				break;
			System.out.println(i);

		}

	}

}

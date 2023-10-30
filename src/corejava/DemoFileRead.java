package corejava;

import java.io.File;
import java.util.Scanner;

public class DemoFileRead {

	public static void main(String[] args) {
		try {
			File f1 = new File("first.txt");
			Scanner sc = new Scanner(f1);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}

		} catch (Exception e) {
			System.out.println("Exception raised");
		}

	}

}

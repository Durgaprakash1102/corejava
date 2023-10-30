package corejava;

import java.io.File;

public class DemoFiles {

	public static void main(String[] args) {
		try {
			File file1 = new File("first.txt");
			if (file1.createNewFile()) {
				System.out.println("File created : " + file1.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.println("Exception:" + e);

		}

	}

}

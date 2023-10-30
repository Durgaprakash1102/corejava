package corejava;

import java.io.FileWriter;

public class DemoFileWrite {

	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("first.txt");
			fr.write("Welcome to java programming");
			fr.close();
			System.out.println("Successfully Written to the file");
		} catch (Exception e) {
			System.out.println("Exception raised");
		}
	}

}

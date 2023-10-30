package corejava;

import java.io.File;

public class DemoCreateNewFile {

	public static void main(String[] args) {
		try {
			File file=new File("Durga.txt");
			if(file.createNewFile()) {
				System.out.println("File created with the name:"+file.getName());
			}
			else {
				System.out.println("File with the name already exists");
			}
		}
		catch(Exception e) {
			System.out.println("Exception Raised!");
		}
	}

}

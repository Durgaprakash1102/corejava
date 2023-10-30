package corejava;

import java.io.FileWriter;

public class DemoFileWriteDurga {

	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("Durga.txt");
			fr.write("Name : Durga Prakash Shilarapu \nStudent Id : AF0328263 \nMobile No : 9502845875 \nCourse : Java Full Stack Using Angular");
			fr.close();
			System.out.println("Successfully Written to the file");
		}
		catch(Exception e) {
			System.out.println("Exception Raised!");
		}
	}

}

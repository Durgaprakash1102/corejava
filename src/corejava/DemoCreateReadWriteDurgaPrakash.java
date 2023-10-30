//Program to create a file to write our details  into the file and print the data in console
package corejava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoCreateReadWriteDurgaPrakash {

	public static void main(String[] args) {
		
		// creating a new file with my name
		try 
		{
			File file = new File("DurgaPrakash.txt");
			if (file.createNewFile()) {
				System.out.println("File created with the name:" + file.getName()+"\n");
			} else {
				System.out.println("File with the name already exists"+"\n");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Raised!");
		}
		
		

		// Writing the student information to the file created
		try 
		{
			FileWriter fr = new FileWriter("DurgaPrakash.txt");
			fr.write("Name : Durga Prakash Shilarapu \nStudent Id : AF0328263 \nMobile No : 9502845875 \nCourse : Java Full Stack Using Angular");
			fr.close();
			System.out.println("Successfully Written to the file"+"\n");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Raised in FileWriter class!");
		}
		
		

		// printing the details to the console
		try 
		{
			File fr = new File("DurgaPrakash.txt");
			try (Scanner sc = new Scanner(fr))
			{
				System.out.println("Information in the file is:"+"\n");
				while (sc.hasNextLine())
				{
					String str = sc.nextLine();
					System.out.println(str);
				}
			}

		} 
		catch (Exception e) 
		{
			System.out.println("Exception raised while printing the details!");
		}

	}
}

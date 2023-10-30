package corejava;

import java.io.File;

public class FileDemoOp {

	public static void main(String[] args) {
		try {
			File f=new File("first.txt");
			if(f.createNewFile()) {
				System.out.println("File Created");
			}
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			System.out.println(f.equals(f));
			System.out.println(f.getParent());
		}
		catch(Exception e) {
			System.out.println("Exception Raised!");
		}
	}

}

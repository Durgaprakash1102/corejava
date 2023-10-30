package corejava;

import java.util.Scanner;

public class RemoveVowelString {

	public static void main(String[] args) {
		String str,str1;
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();
		str1=str.replaceAll("[AEIOUaeiou]","");
		System.out.println(str1);
		
	}

}

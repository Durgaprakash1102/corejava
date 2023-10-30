package corejava;

import java.util.Scanner;

public class SportsCompetition {

	public static void main(String[] args) {
		int Rollno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Rollno:");
		Rollno=sc.nextInt(); 
		if(Rollno==1||Rollno%4==1) {
			System.out.println("Roll no:"+Rollno+" belongs to group A");
		}
		else if(Rollno==2||Rollno%4==2) {
			System.out.println("Roll no:"+Rollno+" belongs to group B");
		}
		else if(Rollno==3||Rollno%4==3) {
			System.out.println("Roll no:"+Rollno+" belongs to group C");
		}
		else {
			System.out.println("Roll no:"+Rollno+" belongs to group D");
		}
		
		
		
	}

}

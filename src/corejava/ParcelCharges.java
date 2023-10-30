package corejava;

import java.util.Scanner;
import java.lang.Math;

public class ParcelCharges {

	public static void main(String[] args) {
		double charge=0,weight;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Weight of the parcel in gms:");
		weight=sc.nextDouble();
		if(weight<=1000) {
			charge=15;
		}
		else 
		{
			weight=weight-1000;
			double temp=weight/500;
			temp=Math.ceil(temp);
			charge=15+(temp*8);
//			//if(weight%500>0){ 
//			charges=charges+8:}
			System.out.println("charges for the parcel:"+charge+" rupees");
		}
	}

}

package corejava;

import java.util.Arrays;
public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] arr= {2,5,4,3,9,7,6};
		int[] arr1= {1,4,6,2,5,7};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//finding array element by linear  search
		int num=9;
		 for(int i=0;i<arr.length;i++) {
			 if(num==arr[i]) {
				 System.out.println("\n"+num+" index = "+i);
				 break;
			 }
		 }
		 //finding array element by using binary search using method in predefined arrays class
		 System.out.println("Index of " +num+" = "+Arrays.binarySearch(arr, num));
		 System.out.println(Arrays.compare(arr, arr1));
	}

}

package corejava;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=20;
		arr[1]=1;
		arr[2]=10;
		arr[3]=5;
		arr[4]=3;
		int sum=0,large=arr[0];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements is:"+sum);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large) {
				large=arr[i];
				
			}
		}
		System.out.println("greatest element in the array is:"+large);
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i]) {
				small=arr[i];
				
			}
		}
		System.out.println("smallest element in the array is:"+small);
	}

}

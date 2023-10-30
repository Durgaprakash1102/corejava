package corejava;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Queue <String> ad=new ArrayDeque<String>();
		ad.add("Raju");
		ad.add("Ravi");
		ad.add("Rajesh");
		ad.add("Ramesh");
		System.out.println(ad);
		System.out.println(ad.contains("Raju"));
		System.out.println(ad.isEmpty());
		System.out.println(ad.remove());
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.peek());
		ad.add("Rajesh");
		System.out.println(ad);
		
	}

}

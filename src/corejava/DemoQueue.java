package corejava;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue <Integer> pq =new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(120);
		pq.add(310);
		pq.add(420);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		
	}

}

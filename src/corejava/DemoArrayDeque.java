//Program demonstrating ArrayDeque to add book names and add and delete the values from both ends of queue
package corejava;

import java.util.ArrayDeque;
import java.util.Queue;

public class DemoArrayDeque {

	public static void main(String[] args) {
		// creating the object for ArrayDeque
		Queue<String> arrdq = new ArrayDeque<String>();

		// adding book names to the array deque
		arrdq.add("Elevation");
		arrdq.add("The Magic Tree");
		arrdq.add("Winter Fairy");
		arrdq.add("Call of the Forest");
		arrdq.add("A Spell Too Far");

		// printing the ArrayDeque
		System.out.println(arrdq);

		// applying different methods on arraydeque
		arrdq.remove("A Spell Too Far");
		System.out.println(arrdq);
		System.out.println(arrdq.hashCode());
		System.out.println(arrdq.isEmpty());
		System.out.println(arrdq.poll());
		System.out.println(arrdq);
		System.out.println(arrdq.peek());
		arrdq.remove("Elevation");
		System.out.println(arrdq);
		System.out.println(arrdq.size());
		System.out.println(arrdq.containsAll(arrdq));

	}

}

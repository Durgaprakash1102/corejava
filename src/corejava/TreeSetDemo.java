//Program demonstrating TreeSet to insert Integer values and print them
package corejava;

//importing TreeSet Class
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Creating a TreeSet Object
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// adding integer values to the TreeSet
		ts.add(1);
		ts.add(5);
		ts.add(3);
		ts.add(4);
		ts.add(8);
		ts.add(2);
		System.out.println(ts);

		// applying different methods on the Treeset
		System.out.println(ts.hashCode());
		System.out.println(ts.remove(8));
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.descendingSet());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
	}

}

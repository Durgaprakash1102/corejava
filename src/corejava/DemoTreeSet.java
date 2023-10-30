//Program demonstrating TreeSet
package corejava;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("India");
		treeset.add("America");
		treeset.add("London");
		treeset.add("China");
		treeset.add("America");
		System.out.println(treeset);
		treeset.add("Australia");
		treeset.add("Italy");
		System.out.println(treeset);
		System.out.println(treeset.contains("India"));
		System.out.println(treeset.hashCode());
		System.out.println(treeset);
		System.out.println(treeset.pollFirst());
		System.out.println(treeset);

	}

}

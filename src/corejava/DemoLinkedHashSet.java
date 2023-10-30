//Program demonstrating LinkedHashSet
package corejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(3);
		lhset.add(2);
		lhset.add(1);
		lhset.add(7);
		lhset.add(9);
		lhset.add(null);
		lhset.add(null);
		System.out.println(lhset);
		System.out.println(lhset.size());
		System.out.println(lhset.getClass());
		System.out.println(lhset.contains(5));
		System.out.println(lhset.isEmpty());
	}

}

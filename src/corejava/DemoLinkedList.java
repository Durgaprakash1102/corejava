package corejava;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		List<Integer> llist =new LinkedList<Integer>();
		llist.add(1);
		llist.add(10);
		llist.add(20);
		llist.add(1,5);
		System.out.println(llist);		
		llist.remove(2);
		System.out.println(llist);
		System.out.println(llist.set(0, 10));
		System.out.println(llist);
		System.out.println(llist.size());
		System.out.println(llist.indexOf(20));
		
	}

}

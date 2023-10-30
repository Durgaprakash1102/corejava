package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List <Integer> arlist=new ArrayList<Integer>();
		arlist.add(10);
		arlist.add(20);
		arlist.add(30);
		arlist.add(40); 
		System.out.println(arlist);
		
		Iterator<Integer> itr=arlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		//List <Character> archar=new ArrayList<Character>();
	}

}

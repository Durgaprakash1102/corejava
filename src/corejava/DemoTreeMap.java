//program demonstrating Treemap to insert employee id and department in which  employee working
package corejava;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		//creating the TreeMap Object
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		//Inserting empid and department to which he belongs
		tmap.put(113, "Testing");
		tmap.put(132, "Developer");
		tmap.put(421, "Engineer");
		tmap.put(131, "Devops");
		tmap.put(426, "Developer");
		tmap.put(125, "Engineer");
		tmap.put(135, "Jam");
		tmap.put(034, null);
		System.out.println(tmap);
		System.out.println(tmap.descendingKeySet());
		System.out.println(tmap.firstKey());
		System.out.println(tmap.firstEntry());
		System.out.println(tmap.descendingMap());
		System.out.println(tmap.lowerEntry(5));
	}

}

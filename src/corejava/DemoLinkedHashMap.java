//Program demonstrating LinkedHashMap to enter the months list and days present in it.
package corejava;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		
		//creating the Object of LinkedHashMap
		Map<String,Integer> lmap=new LinkedHashMap<String,Integer>();
		
		//inserting months and no.of days in the month into the LinkedHashMap 
		lmap.put("January", 30);
		lmap.put("February", 28);
		lmap.put("March", 31);
		lmap.put("April", 30);
		lmap.put("May", 31);
		lmap.put("July", 31);
		lmap.put("August", 31);
		lmap.put("September", 30);
		lmap.put("October", 31);
		lmap.put("November", 30);
		lmap.put("December", 31);
		lmap.put(null, 31);
		lmap.put(null, 30);
		
		//performing different operations on the LinkedHashMap
		System.out.println(lmap+"\n");
		System.out.println("Size of the LinkedHashMap:"+lmap.size()+"\n");
		System.out.println("Keyset of Linked Hash Map:"+lmap.keySet()+"\n");
		System.out.println("Values of Linked Hash Map:"+lmap.values()+"\n");
		lmap.putIfAbsent("June", 30);
		lmap.remove(null);
		System.out.println("No of days present in February :"+lmap.get("February")+"\n");
		System.out.println("Class of lmap:"+lmap.getClass()+"\n");
		System.out.println(lmap);
	}

}

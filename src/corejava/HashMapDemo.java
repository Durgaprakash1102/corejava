//Program to insert student information id's and names using HashMap.
package corejava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//creating HashMap Object
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		//inserting student id's and names
		hmap.put(111, "Jhon");
		hmap.put(222, "Joe");
		hmap.put(333, "Ram");
		hmap.put(444, "Rahul");
		hmap.put(555, "Ravi");
		hmap.put(null, "Rajesh");
		hmap.put(null, "Sita");
		hmap.put(666, null);
		
		//performing different operations on the HashMap
		System.out.println(hmap+"\n");
		
		System.out.println(hmap.remove(null)+"\n");
		
		System.out.println(hmap+"\n");
		
		System.out.println("Whether hashmap contains null key:"+hmap.containsKey(null)+"\n");
		
		System.out.println("Whether hashmap contains Sita Value:"+hmap.containsValue("Sita")+"\n");
		
		System.out.println("Keyset of the hash map is:"+hmap.keySet()+"\n");
		
		System.out.println("Values present in the hash map is:"+hmap.values()+"\n");
		
		System.out.println(hmap.hashCode()+"\n");
		
		System.out.println(hmap.remove(666)+"\n");
		
		System.out.println(hmap+"\n");

	}

}

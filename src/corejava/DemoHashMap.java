//Program demonstrating Hashmap
package corejava;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Sun");
		hmap.put(2, "Mon");
		hmap.put(3, "Tue");
		hmap.put(4, "Wed");
		hmap.put(5, "Thu");
		hmap.put(null, "Fri");
		hmap.put(null, "Sat");
		hmap.put(6, null);
		hmap.put(7, null);
		hmap.put(8, "Sun");
		hmap.put(9, "Sun");
		System.out.println(hmap);
		System.out.println(hmap.remove(null));
		System.out.println(hmap);
		System.out.println(hmap.containsKey(null));
		System.out.println(hmap.containsValue("Fri"));
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		System.out.println(hmap.hashCode());
		System.out.println(hmap.remove(9));
		System.out.println(hmap);

	}

}

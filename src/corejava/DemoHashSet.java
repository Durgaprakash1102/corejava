package corejava;
import java.util.*;

public class DemoHashSet {

	public static void main(String[] args) {
		Set <Integer> st=new HashSet<Integer>();
		st.add(2);
		st.add(4);
		st.add(6);
		st.add(8);
		st.add(10);
		System.out.println(st);
		st.add(10);
		st.add(null);
		System.out.println(st);
		st.add(null);
		System.out.println(st);
		st.remove(null);
		System.out.println(st);
		st.add(null);
		System.out.println(st.contains(null));
		
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

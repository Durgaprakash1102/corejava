package corejava;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arlist =new ArrayList();
		arlist.add(10);
		arlist.add(100.5);
		arlist.add("Durga");
		arlist.add('p');
		arlist.add(null);
		arlist.add(10);
		System.out.println(arlist);
		System.out.println(arlist.size());
		System.out.println(arlist.contains(1));
		System.out.println(arlist.remove(0));
		System.out.println(arlist);
		System.out.println(arlist.get(2));
		System.out.println(arlist.hashCode());
		System.out.println(arlist.indexOf(10));
		
		
	}

}

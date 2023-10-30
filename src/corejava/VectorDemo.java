package corejava;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List <String> vlist=new Vector<String>();
		vlist.add("Mon");
		vlist.add("Tue");
		vlist.add("Fri");
		vlist.add(2,"Wed");
		vlist.add(3,"Thurs");
		vlist.add("sat");
		System.out.println(vlist);
		System.out.println(vlist.remove(5));
		System.out.println(vlist);
		System.out.println(vlist.set(4,"sun"));
		System.out.println(vlist);
		System.out.println(vlist.isEmpty());
		System.out.println(vlist.indexOf("Mon"));
		System.out.println(vlist.lastIndexOf(vlist));
	}

}

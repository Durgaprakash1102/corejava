package corejava;

import java.util.List;
import java.util.Vector;

public class VectorBook {

	public static void main(String[] args) {
		List <Book> booklist=new Vector<Book>();
		booklist.add(new Book(11,"c",500));
		booklist.add(new Book(12,"Java",800));
		booklist.add(new Book(13,"Python",900));
		booklist.add(new Book(14,"Sql",600));
		
		System.out.println(booklist);
		System.out.println(booklist.size());
	}

}

//Program using vector to store the list of students details and print the detaails
package corejava;

//importing list classs
import java.util.List;
import java.util.Vector;

public class VectorSdt_Details {

	public static void main(String[] args) {
		
		// Creating the object for vector class
		List<Sdt_Details> sdlist = new Vector<Sdt_Details>();

		// adding student details to the vector
		sdlist.add(new Sdt_Details(1, "A", "CSE", 50000));
		sdlist.add(new Sdt_Details(2, "B", "IT", 40000));
		sdlist.add(new Sdt_Details(3, "C", "CSD", 60000));
		sdlist.add(new Sdt_Details(1, "D", "CSE-ML", 50000));

		// printing the student details
		System.out.println(sdlist);

		// printing the size of the vector
		System.out.println(sdlist.size());

	}

}

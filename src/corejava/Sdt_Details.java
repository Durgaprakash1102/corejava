//program declaring the student details class and declaring parameterized constructor and toString method to print the details in the vector class
package corejava;

public class Sdt_Details {
	Integer sdt_id;
	String sdt_name;
	String sdt_branch;
	Integer sdt_fees;

	// parameterized constructors
	public Sdt_Details(Integer sdt_id, String sdt_name, String sdt_branch, Integer sdt_fees) {
		super();
		this.sdt_id = sdt_id;
		this.sdt_name = sdt_name;
		this.sdt_branch = sdt_branch;
		this.sdt_fees = sdt_fees;
	}

	// toString method for printing the student details
	public String toString() {
		return "Details [sdt_id=" + sdt_id + ", sdt_name=" + sdt_name + ", sdt_branch=" + sdt_branch + ", sdt_fees="
				+ sdt_fees + "]";
	}

}

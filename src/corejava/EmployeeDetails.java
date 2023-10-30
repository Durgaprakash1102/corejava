package corejava;

public class EmployeeDetails {
	int empid, salary;
	String name;

	// simple constructor
	EmployeeDetails() {
		System.out.println("No Employee details provided to display");
	}

	// parameterized constructor
	EmployeeDetails(int x, String y, int z) {
		empid = x;
		name = y;
		salary = z;
	}

	// method to display employee information
	void displayEmpInfo() {
		System.out.println("Employee Id:" + empid + " " + "Employee Name:" + name + " " + "Salary:" + salary);
	}

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.displayEmpInfo();

		System.out.println();

		EmployeeDetails ed1 = new EmployeeDetails(123, "Raju", 10000);
		ed1.displayEmpInfo();

	}

}

package corejava;

//child class which inherits the Employee class
public class Developer extends Employee {
	int salary;

	void devsalary() {
		System.out.println("Developer Salary ="+salary);
	}

	public static void main(String[] args) {
		Developer d = new Developer();
		d.empid=1231;
		d.empname="Ram";
		d.salary=50000;
		
		d.empdetails();
		d.devsalary();

	}

}

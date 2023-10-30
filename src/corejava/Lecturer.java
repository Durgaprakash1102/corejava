package corejava;

public class Lecturer extends Employe {

	void duty() {
		System.out.println("Lecturer should take classes for the students");
	}

	public static void main(String args[]) {
		Lecturer l = new Lecturer();
		l.duty();
		
		Employe e=new Employe();
		e.duty();
	}

}

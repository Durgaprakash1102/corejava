package corejava;

public class Nursee extends Surgeon {
	
	Nursee(){
		System.out.println("Nurse constructor called");
	}
	
	void assist() {
		System.out.println("Nurses will assist the doctors");
	}
	public static void main(String[] args) {
		Nursee n= new Nursee();
		n.category();
		n.duty();
		n.assist();
	}

}

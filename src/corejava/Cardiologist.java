package corejava;

public class Cardiologist extends Doctor {
	
	Cardiologist(){
		System.out.println("Cardiologist constructor called");
	}
	
	void action() {
		System.out.println("Cardiologist treats heart related problems");
	}

	public static void main(String[] args) {
		Cardiologist c = new Cardiologist();
		c.category();
		c.action();
	}

}

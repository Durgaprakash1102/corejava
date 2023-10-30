package corejava;

//derived class of Skoda
public class Superb extends Skoda {

	Superb() {
		System.out.println("Superb got initialized");
	}

	void speed() {
		System.out.println("200 will be the highest speed for superb");
	}

	public static void main(String[] args) {
		Superb s1 = new Superb();
		s1.engine();
		s1.cc();
		s1.speed();
	}

}

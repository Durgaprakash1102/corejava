package corejava;

public class ConstructorDemo {
	int a, b, c;

	// Simple Constructor
	ConstructorDemo() {
		a = 1;
		b = 2;
		c = 3;
		// System.out.println("Object Created");
	}

	ConstructorDemo(int x) {
		a = x;
	}

	// Parameterized Constructor
	ConstructorDemo(int x, int y) {
		a = x;
		b = y;
	}

	ConstructorDemo(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	// Method to access a and b values
	void getab() {
		System.out.println("a=" +a + "," + "b=" +b + "," + "c=" +c);
	}

	public static void main(String[] args) {
		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.getab();

		ConstructorDemo cd2 = new ConstructorDemo(20);
		cd2.getab();

		ConstructorDemo cd3 = new ConstructorDemo(30, 40);
		cd3.getab();

		ConstructorDemo cd4 = new ConstructorDemo(50, 60, 70);
		cd4.getab();

	}

}

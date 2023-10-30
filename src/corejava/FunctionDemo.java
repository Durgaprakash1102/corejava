//Program on Functions
package corejava;

public class FunctionDemo {
	int a, b;// instance variables
	// simple function

	void add() {
		System.out.println("Addition : a+b= " + (a + b));
	}

	// function with return type
	int subtract() {
		return a - b;
	}

	// static function with return type and parameters
	static int product(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		FunctionDemo fd = new FunctionDemo();
		fd.a = 100;
		fd.b = 50;
		fd.add();
		System.out.println("Difference : a-b= " + fd.subtract());
		System.out.println("Product = " + product(20, 30));

	}

}

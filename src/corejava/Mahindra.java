/*3.Write a program using inheritance. where Car is the Super class, Mahindra is derived class. define methods in two classes and 
    using Mahindra object call car class method.
package corejava;

//super class of Mahindra
public class Car {

	// simple constructor of car class
	Car() {
		System.out.println("Car Started");
	}

	// method in Car class
	void engine() {
		System.out.println("Engine Started");
	}

}

//Derived class of Car class
public class Mahindra extends Car {
	// simple constructor
	Mahindra() {
		System.out.println("Mahindra Started");
	}

	// method in Mahindra class
	void cc() {
		System.out.println("Mahindra cc is 10000");
	}

	public static void main(String[] args) {
		Mahindra m = new Mahindra();// object created for Mahindra class
		m.engine();
		m.cc();

	}

}
*/
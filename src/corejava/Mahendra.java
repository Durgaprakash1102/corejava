/*3.Write a program using inheritance. where Car is the Super class, Mahendra is derived class. define methods in two classes and using Mahendra object call car class method.*/
//Single inheritance
package corejava;

//super class of Mahendra
class Car {

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
class Mahendra extends Car {
	// simple constructor
	Mahendra() {
		System.out.println("Mahindra Started");
	}

	// method in Mahendra class
	void cc() {
		System.out.println("Mahindra cc is 10000");
	}

	public static void main(String[] args) {
		Mahendra m = new Mahendra();// object created for Mahendra class and accessing car class methods
		m.engine();
		m.cc();

	}

}

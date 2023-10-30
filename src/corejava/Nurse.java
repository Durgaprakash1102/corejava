/*4.Create a program in java to implement multilevel inheritance and hierarchical inheritance.Take classes like: Doctor, Surgeon and Nurse */
//Multilevel inheritance 
package corejava;

//super class of Surgeon class
class Doctor {

	// simple constructor of doctor class
	Doctor() {
		System.out.println("Doctor constructor called");
	}

	// method in doctor class
	void category() {
		System.out.println("There are different categories in Doctors");
	}

}

//derived class of Doctor class and Super class of Nurse class
class Surgeon extends Doctor {

	// Simple constructor of surgeon class
	Surgeon() {
		System.out.println("Surgeon class constructor");
	}

	// method in surgeon class
	void duty() {
		System.out.println("Surgeon performs operations");
	}

}

//derived class of Surgeon class
class Nurse extends Surgeon {
	// simple constructor of Nurse class
	Nurse() {
		System.out.println("Nurse constructor called");
	}

	// method in nurse class
	void assist() {
		System.out.println("Nurses will assist the doctors");
	}

	public static void main(String[] args) {
		Nurse n = new Nurse();// object created for nurse class and accessing super classes methods
		n.category();
		n.duty();
		n.assist();
	}

}

/* 
//Hierarchial inheritance 


class Doctor {

	// simple constructor of doctor class
	Doctor() {
		System.out.println("Doctor constructor called");
	}

	// method in doctor class
	void category() {
		System.out.println("There are different categories in Doctors");
	}

}

//derived class of Doctor class 
class Surgeon extends Doctor {

	// Simple constructor of surgeon class
	Surgeon() {
		System.out.println("Surgeon class constructor");
	}

	// method in surgeon class
	void duty() {
		System.out.println("Surgeon performs operations");
	}

}
 class Cardiologist extends Doctor {
 
	//simple constructor
	Cardiologist(){
		System.out.println("Cardiologist constructor called");
	}
	
	//method in Cardiologist class
	void action() {
		System.out.println("Cardiologist treats heart related problems");
	}

	public static void main(String[] args) {
		Cardiologist c = new Cardiologist();//object created for Cardiologist class and accesssing methods of doctor class
		c.category();
		c.action();
	}

}
 */
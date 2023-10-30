//Program to demonstrate interfaces

package corejava;

public class FourWheeler implements Vehicle {

	public void speed() {
		System.out.println("The minimum speed of four wheeler is : 40 KMPH");
	}

	public void milage() {
		System.out.println("The minimum milage of four wheeler is : 20 KMPL");
	}

	public static void main(String[] args) {
		FourWheeler bus = new FourWheeler();
		bus.speed();
		bus.milage();

	}

}

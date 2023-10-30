/*2.Write a Program Using a class Circle With variables radius, color. Define Constructor simple(radius=1,color="red") and 
    parameterized constructor */

package corejava;

public class Circle {
	double radius;
	String color;

	// Simple constructor
	Circle() {
		radius = 1.0;
		color = "Red";
		System.out.println("color of circle is :" + color);
	}

	// constructor with two parameters
	Circle(int x, String y) {
		radius = x;
		color = y;
		System.out.println("color of circle is :" + color);
	}

	// method to return area of circle
	double getArea() {
		double area;
		area = 3.14 * radius;
		return area;
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Area of circle is :" + c.getArea());

		System.out.println();

		Circle c1 = new Circle(10, "Green");
		System.out.println("Area of circle is :" + c1.getArea());

	}

}

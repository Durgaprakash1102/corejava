package corejava;

public class Rectangle implements Shape {
	//parameterized constructor
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	int length, breadth;

	//overriding area method 
	public void area() {
		int area = (length * breadth);
		System.out.println("Area of rectangle is:" + area);

	}

	//overriding perimeter method
	public void perimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle is:" + perimeter);

	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(25, 30);//object creation
		r.area();
		r.perimeter();

	}

}

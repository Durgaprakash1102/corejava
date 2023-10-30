package corejava;

public class Circle_ implements Shape {
	float radius;

	//overriding area method 
	public void area() {
		float area = pi * radius * radius;
		System.out.println("Area of circle is:" + area);

	}

	//overriding perimeter method
	public void perimeter() {
		float perimeter = 2 * pi * radius;
		System.out.println("Perimeter of circle is:" + perimeter);

	}

	public static void main(String[] args) {
		Circle_ c = new Circle_();//object creation
		c.radius = 5.0f;
		c.area();
		c.perimeter();

	}

}

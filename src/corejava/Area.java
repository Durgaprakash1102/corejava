package corejava;

public class Area {
	int s, l, b;
	float r;

	void calArea(int x) {
		s = x;
		System.out.println("Area of square is :" + (s * s));
	}

	void calArea(int x, int y) {
		l = x;
		b = y;
		System.out.println("Area of rectangle is :" + (2 * (l + b)));
	}

	void calArea(float z) {
		r = z;
		float pi = 3.14f;
		System.out.println("Area of circle is :" + (pi * r * r));
	}

	public static void main(String[] args) {
		Area area = new Area();
		area.calArea(5);
		area.calArea(2, 3);
		area.calArea(4.0f);
	}

}

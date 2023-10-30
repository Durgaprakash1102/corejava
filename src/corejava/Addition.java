//program using Method overloading

package corejava;

public class Addition {
	int a, b, c; // instance variables
	float x, y;

	void sum(int d, int e) {
		a = d;
		b = e;
		System.out.println("a+b= " + (a + b));
	}

	void sum(int d, int e, int f) {
		a = d;
		b = e;
		c = f;
		System.out.println("a+b+c= " + (a + b + c));
	}

	void sum(float d, float e) {
		x = d;
		y = e;
		System.out.println("x+y= " + (x + y));
	}

	int compare(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
		
	}
	int square(int a) {
		return a*a;
	}
	int factorial(int num) {
		if(num==1)
			return 1;
		else
			return num* factorial(num-1);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		add.sum(150, 200);
		add.sum(150, 200, 300);
		add.sum(15.56f, 45.44f);
		System.out.println(add.factorial(5));
	}

}

package corejava;

public class DemoException {

	public static void main(String[] args) {
		try {
			String s=null;
			int a=50/0;
			System.out.println(a);
			System.out.println(s.length());
			
		}catch(ArithmeticException e) {
			System.out.println("Division with Zero");
		}catch(NullPointerException e) {
			System.out.println("Null object");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}

//program demonstrating access modifiers
package corejava;

class  Data{
	public int a=100;
	private int b=200;
	protected int c=300;
	
	protected void returnb() {
		System.out.println("private variable value is:"+b);
	}
}


public class DemoAccessModifiers {

	public static void main(String[] args) {
		Data d=new Data();
		System.out.println("public variable value is:"+d.a);
		d.returnb();
		System.out.println("protected variable value is:"+d.c);
		
		
	}

}

package corejava;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strb=new StringBuffer("welcome");
		System.out.println(strb);
		System.out.println(strb.hashCode());
		System.out.println(strb.capacity());
		System.out.println(strb.charAt(3));
		System.out.println(strb.hashCode());
		
		StringBuffer strb1=new StringBuffer("welcome java");
		System.out.println(strb.equals(strb1));
		System.out.println(strb.length());
		System.out.println(strb.append('c'));
		System.out.println(strb);
		System.out.println(strb.hashCode());
		
		

	}

}

package corejava;

public class StringBuilderDemo {
	

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java Full Stack");
		String st="web";
		StringBuilder sb1 = new StringBuilder(30);
		System.out.println(st);
		sb1.append("  Python");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		System.out.println(sb.length());
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb.delete(0, 5));
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}

}

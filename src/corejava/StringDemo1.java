//Program demonstarting String class
package corejava;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "Durga Prakash";
		System.out.println(str);

		String str1 = new String("Welcome");
		System.out.println(str1);

		char[] character = { 'j', 'a', 'v', 'a' };
		String str2 = new String(character);
		System.out.println(str2);
		
		String str3 = new String("Durga Prakash");
		String str4 = new String(" hi  ");
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(6));
		System.out.println(str.concat(" Hello"));
		System.out.println(str.length());
		
		//compareto method will compare 2 objects based on hashcode
		System.out.println(str.compareTo(str3));
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str1));
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str2));
		System.out.println(str.indexOf('r'));
		System.out.println(str.lastIndexOf('r'));
		System.out.println(str.isEmpty());
		System.out.println(str1.replace('W','M'));
		System.out.println(str4.trim());
		System.out.println(str.startsWith("D"));
		System.out.println(str.endsWith("h"));
		
		
	}

}
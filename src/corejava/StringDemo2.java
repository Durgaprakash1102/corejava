package corejava;
class Str{
	String s;
	
	public Str(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
public class StringDemo2 {

	public static void main(String[] args) {
		Str s1=new Str("Java");
		System.out.println(s1.getS());
		System.out.println(s1.s.hashCode());
		s1.setS("Language");
		System.out.println(s1.getS());
		System.out.println(s1.s.hashCode());
		s1.setS("Java Language");
		System.out.println(s1.getS());
		System.out.println(s1.s.hashCode());
		//whenever we change the string literal value the new string object is created in string constant pool


	}

}

//Program demonstrating Strig Tokenizer
package corejava;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		// declaring strings using String Tokenizer
		// constructor with string parameter
		StringTokenizer st = new StringTokenizer("Welcome java");

		// constructor with string parameter and input delimiter
		StringTokenizer st1 = new StringTokenizer("Hello world", " ");

		// constructor with string parameter and input delimiter and boolean value
		StringTokenizer st2 = new StringTokenizer("@Angular@course@", "@", true);

		// counting tokens in the strings
		System.out.println(st.countTokens());
		System.out.println(st1.countTokens());
		System.out.println(st2.countTokens());

	}

}

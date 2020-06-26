package string_demos;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		
		if (s.equals(new StringBuffer(s).reverse().toString())) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a Palindrome!");
		}
	}

}

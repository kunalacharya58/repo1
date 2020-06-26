package string_demos;

public class StringTitleCase {

	public static void main(String[] args) {
		
		String message = "hi hello i am doing good, my Name is Harsh";
		
		// split the message into words using space
		String[] words = message.split(" ");
		
		// create a string builder object
		StringBuilder sb = new StringBuilder();
		
		// run through each word in the message
		for (int i = 0; i < words.length; i++) {
				// capitalize each beginning letter from every word
				sb.append(Character.toUpperCase(words[i].charAt(0)))
				// append the rest of the string as it is
				.append(words[i].substring(1))
				// append each word with a whitespace for gaps
				.append(" ");		
		}
		
		// finally trim the whole string to remove the extra whitespace
		// encountered at the end of the message
		System.out.println(sb.toString().trim());
	}

}

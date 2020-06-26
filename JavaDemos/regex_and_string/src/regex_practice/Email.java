package regex_practice;

public class Email {

	public static void main(String[] args) {
		
		String email = "kunalacharya58@gmail.com";
		
		String regex = "[a-zA-Z0-9+.]+@+[a-z]{1,10}\\.[a-z]{2,4}";
		
		if(email.matches(regex)) {
			System.out.println("Email Valid!");
		} else {
			System.out.println("Email Invalid!");
		}

	}

}

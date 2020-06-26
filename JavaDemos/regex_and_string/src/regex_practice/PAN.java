package regex_practice;

public class PAN {

	public static void main(String[] args) {
		
		String pan = "MECCA0786E";
		
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		if(pan.matches(regex)) {
			System.out.println("Valid PAN Number!");
		} else {
			System.out.println("Invalid PAN Number!");
		}

	}

}

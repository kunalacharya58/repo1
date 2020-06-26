package regex_practice;

public class AadharNumber {

	public static void main(String[] args) {
		
		String aadhar = "1234-1234-1234";
		
		String regex = "[0-9]{4}+-[0-9]{4}+-[0-9]{4}";
		
		if(aadhar.matches(regex)) {
			System.out.println("Valid AADHAR!");
		} else {
			System.out.println("Invalid AADHAR!");
		}

	}

}

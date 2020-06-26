package custom_exception;

public class Presenter {

	public static void main(String[] args) {
		
		AgeValidation av = new AgeValidation();
		
		try {			
			if(av.validate(-1)) {
				System.out.println("You are perfect for this!");
			}
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

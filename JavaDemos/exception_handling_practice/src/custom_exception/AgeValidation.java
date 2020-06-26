package custom_exception;

public class AgeValidation {
	
	public boolean validate(int age) {
		if (age <= 0) {			
			throw new InvalidAgeException("Age cannot be negative!");
		} if (age < 18) {
			throw new InvalidAgeException("You are an underage!");
		} else if (age > 30) {
			throw new InvalidAgeException("You are too old for this!");
		}
		return true;
	}
	
}

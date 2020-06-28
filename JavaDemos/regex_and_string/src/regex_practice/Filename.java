package regex_practice;

public class Filename {
	
	public static boolean valid(String a) {
//		if (a.length() < 1) {
//			return false;
//		}
		String b = a.replaceAll("[a-zA-Z0-9]", "");
		if(b.length() > 0) return false;
		return true;
	}

	public static void main(String[] args) {
		String filename = "a.";
		//StringBuilder sb = new StringBuilder(filename);
		
		String[] name = filename.split("\\.");
		
		System.out.println(name.length);
		
		if (name.length > 2) {
			System.out.println("Invalid");
		} else if(valid(name[0]) && valid(name[1])) {
				System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

}

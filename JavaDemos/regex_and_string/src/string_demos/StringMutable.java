package string_demos;

public class StringMutable {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hey good morning everyone");
		System.out.println(sb);
		
		sb.append(", welcome to our class!");
		System.out.println(sb);
		
		String[] array = sb.toString().split(" ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}

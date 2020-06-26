package exception_handling;

public class Example1 {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 2;
		Integer ans = 0;
		
		try {			
			ans = a/b;
			System.out.println("Division a/b = "+ans);
		} 
		catch(ArithmeticException e) {
			System.out.println("Exception occured: "+e.getMessage());
		} 
		catch(NullPointerException e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
		finally {			
			System.out.println("{ this code will always execute }");
		}
		System.out.println("{ "
				+ "this will execute only if "
				+ "exception is handled }");
	}

}

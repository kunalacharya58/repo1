package string_demos;

public class StringMain {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		String c = "hEllo";
		
		System.out.println("a & b: "+a.equals(b));
		System.out.println("a & c: "+a.equals(c));
		System.out.println("b & c: "+b.equals(c));
		
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(Integer.toHexString(b.hashCode()));
		System.out.println(Integer.toHexString(c.hashCode()));
	}

}

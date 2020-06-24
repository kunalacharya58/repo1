package interface_pack;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface1 in1 = new InterfaceClass();
		
		in1.hello();
		in1.helloagain();
		in1.bye();
		
		Interface2 in2 = new InterfaceClass();
		in2.hello();
		in2.goodbye();
		
		System.out.println(Integer.MAX_VALUE);
		

	}

}

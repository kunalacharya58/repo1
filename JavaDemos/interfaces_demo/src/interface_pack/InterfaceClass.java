package interface_pack;

public class InterfaceClass implements Interface1, Interface2 {
	
	public InterfaceClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Interface1");
	}

	@Override
	public void helloagain() {
		// TODO Auto-generated method stub
		System.out.println("Hello Again from Interface1");
	}

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("GoodBye from Interface1");
	}

	@Override
	public void goodbye() {
		// TODO Auto-generated method stub
		System.out.println("GoodBye from Interface2");
	}

}

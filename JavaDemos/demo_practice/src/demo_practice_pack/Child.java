package demo_practice_pack;

public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Parent p1 = new Parent("Nagma", 200);
		
		p.setId(100);
		p.setName("sardar");
		
		System.out.println(p);
		System.out.println(p1);
	}

}

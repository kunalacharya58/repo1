package myPack;

public class myClass {
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(01);
		s.setName("Kunal");
		s.setAge(22);
		s.setScore(100);
		
		System.out.println("Roll Number: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		System.out.println("Score: "+s.getScore());
				
	}
}

package demo_practice_pack;

public class Parent {
	
	private String name;
	private int id;
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", id=" + id + "]";
	}
	
	
}

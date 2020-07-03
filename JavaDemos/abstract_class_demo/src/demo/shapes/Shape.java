package demo.shapes;

public abstract class Shape {
	
	public static int ID = 0;
	public int serialNumber;
	
	public Shape() {
		setSeriaNumber();
	}
	
	public void setSeriaNumber() {
		serialNumber = ++Shape.ID;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public abstract float area();
	
	public abstract float perimeter();

	public void showClass() {
		System.out.println(this.getClass());
	}

}

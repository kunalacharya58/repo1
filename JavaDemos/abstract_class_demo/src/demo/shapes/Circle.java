package demo.shapes;

public class Circle extends Oval {
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public float area(float radius) {
		return (float) Math.PI*radius*radius;
	}
	
	public float perimeter(float radius) {
		return (float) Math.PI * 2 * radius;
	}
	
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return super.perimeter();
	}
	
	@Override
	public float area() {
		return super.area();
		// TODO Auto-generated method stub
	}
	
}

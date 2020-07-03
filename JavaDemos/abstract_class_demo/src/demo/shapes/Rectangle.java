package demo.shapes;

public class Rectangle extends Shape {
	
	public Rectangle() {
		super();
	}

	public float area(float length, float breadth) {
		return length * breadth;
	}

	public float perimeter(float length, float breadth) {
		return 2*(length + breadth);
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

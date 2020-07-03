package demo.shapes;

public class Oval extends Shape {
	
	public Oval() {
		super();
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
	
	public float area(float major, float minor) {
		return (float)(Math.PI * major * minor);
	}
	
	public float perimeter(float major, float minor) {
		double sqr = Math.sqrt((major*major + minor*minor)/2);
		return (float)(Math.PI * 2 * (sqr));
	}

}

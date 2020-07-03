package demo.shapes;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		Oval oval = new Oval();
		
		Circle circle = new Circle();
		
		rect1.showClass();
		System.out.println("Serial Number: "+rect1.getSerialNumber());
		System.out.println("Area: "+rect1.area(3, 4));
		System.out.println("Perimeter: "+rect1.perimeter(12, 10));
		
		System.out.println();
		
		rect2.showClass();
		System.out.println("Serial Number: "+rect2.getSerialNumber());
		System.out.println("Area: "+rect2.area(4, 5));
		System.out.println("Perimeter: "+rect2.perimeter(8, 6));
		
		System.out.println();
		
		oval.showClass();
		System.out.println("Serial Number: "+oval.getSerialNumber());
		System.out.println("Area: "+oval.area(12, 5)); //188.5
		System.out.println("Perimeter: "+oval.perimeter(10, 5)); //49.64
		
		System.out.println();
		
		circle.showClass();
		System.out.println("Serial Number: "+circle.getSerialNumber());
		System.out.println("Area: "+circle.area(10)); //314
		System.out.println("Perimeter: "+circle.perimeter(10)); //62.8

	}

}

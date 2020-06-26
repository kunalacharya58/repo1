package implement_queue;

import java.util.LinkedList;
import java.util.Queue;

public class CarMain {

	public static void main(String[] args) {
		
		Queue<Car> cars = new LinkedList<>();
		
		cars.add(new Car(100, 60, 4, "Tata", "Family"));
		cars.add(new Car(200, 120, 6, "Toyota", "Off-Road"));
		cars.add(new Car(300, 80, 4, "Hyundai", "Family"));
		cars.add(new Car(400, 40, 2, "Porsche", "Racer"));
		cars.add(new Car(500, 100, 6, "Mahindra", "Off-Road"));
		cars.add(new Car(600, 60, 4, "Suzuki", "Family"));
		
		System.out.println("Showing List: ");
		printCars(cars);
		
		cars.remove();
		System.out.println("\n\nAfter remove(): ");
		printCars(cars);
		
		cars.add(new Car(100, 60, 4, "Tata", "Family"));
		System.out.println("\n\nAfter add(): ");
		printCars(cars);
		
		System.out.println("\n\nPeek: "+cars.peek());

	}
	
	public static void printCars(Queue<Car> cars) {
		for (Car c : cars) {
			System.out.println(c);
		}
	}

}

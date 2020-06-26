package collections_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> plist = new ArrayList<>();
		
		plist.add(new Product(100, "pA", 1, 2.3f, 17.80f));
		plist.add(new Product(300, "pB", 3, 4.3f, 11.80f));
		plist.add(new Product(400, "pC", 2, 3.3f, 19.80f));
		plist.add(new Product(200, "pE", 3, 5.0f, 17.80f));
		plist.add(new Product(600, "pD", 1, 4.1f, 11.80f));
		plist.add(new Product(500, "pF", 2, 3.3f, 12.80f));
		
		System.out.println("Printing the product list:");
		printProductList(plist);
		
		// sorting by ID
		Collections.sort(plist, (Product p1, Product p2) -> {
			Integer i1 = p1.getId();
			Integer i2 = p2.getId();
			return i1.compareTo(i2);
		});
		System.out.println("\n\nShowing the product list by ID:");
		printProductList(plist);
		
		// sorting by Name
		Collections.sort(plist, (Product p1, Product p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		System.out.println("\n\nShowing the product list by Name:");
		printProductList(plist);
		
		// sorting by batch
		Collections.sort(plist, (Product p1, Product p2) -> {
			Integer i1 = p1.getBatch();
			Integer i2 = p2.getBatch();
			return i1.compareTo(i2);
		});
		System.out.println("\n\nShowing the product list by Batch:");
		printProductList(plist);
		
		// sorting by rating
		Collections.sort(plist, (Product p1, Product p2) -> {
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();
			return f2.compareTo(f1);
		});
		System.out.println("\n\nShowing the product list by Rating:");
		printProductList(plist);
		
		// sorting according to lowest cost but higher rating
		Collections.sort(plist, (Product p1, Product p2) -> {
			Float f1 = p1.getCost();
			Float f2 = p2.getCost();
			int x = f1.compareTo(f2);
			if (x == 0) {
				f1 = p1.getRating();
				f2 = p2.getRating();
				return f2.compareTo(f1);
			}
			return x;
		});
		System.out.println("\n\naccording to lowest cost but higher rating: ");
		printProductList(plist);
	}
	
	public static void printProductList(List<Product> plist) {
		for (int i = 0; i < plist.size(); i++) {
			System.out.println(plist.get(i));
		}
	}

}

package collections_sorting;

import java.util.Comparator;

public class Product implements Comparator<Product>{
	
	private int id;
	private String name;
	private int batch;
	private float rating;
	private float cost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int batch, float rating, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.rating = rating;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", batch=" + batch + ", rating=" + rating + ", cost=" + cost
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

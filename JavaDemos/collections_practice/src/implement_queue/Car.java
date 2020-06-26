package implement_queue;

public class Car {
	
	private int id;
	private int mileage;
	private int seats;
	private String brand;
	private String type;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int id, int mileage, int seats, String brand, String type) {
		super();
		this.id = id;
		this.mileage = mileage;
		this.seats = seats;
		this.brand = brand;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", mileage=" + mileage + ", seats=" + seats + ", brand=" + brand + ", type=" + type
				+ "]";
	}
	
	
	

}

package sorting_again;

import java.util.Comparator;

public class Flat implements Comparator<Flat> {
	
	private int bhk;
	private int rent;
	private int location;
	
	public Flat() {
		// TODO Auto-generated constructor stub
	}

	public Flat(int bhk, int rent, int location) {
		super();
		this.bhk = bhk;
		this.rent = rent;
		this.location = location;
	}

	public int getBhk() {
		return bhk;
	}

	public void setBhk(int bhk) {
		this.bhk = bhk;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Flat [bhk=" + bhk + ",\t rent=" + rent + ",\t location=" + location + "]";
	}

	@Override
	public int compare(Flat arg0, Flat arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

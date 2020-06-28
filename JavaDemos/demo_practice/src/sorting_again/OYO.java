package sorting_again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OYO {
	
	public static void main(String[] args) {
		
		List<Flat> flats = new ArrayList<>();
		
		// a list of preferred locations in order.
//		String prefer_loc[] = {	"do not delete this", 
//							"Tardeo", 
//							"Prabhadevi",
//							"Worli Sea Face", 
//							"Dadar",
//							"Malabar Hill",
//							"Juhu",
//							};
		String prefer_loc[] = {	"do not delete this", 
				"Whirlpool",
				"LG",
				"Samsung",
				"Godrej",
				"Panasonic", 
				"Hiaer",
				};
		
		
		// set limits
		int offers = 15;
		int minBHK = 1, maxBHK = 5;
		int scale = 5000, minRent = 2, maxRent = 6;
		int minLoc = 1, maxLoc = prefer_loc.length -1;
		
		// populating offers into the list
		for (int i = 0; i < offers; i++) {
			int random_city = (int)(Math.random() * (maxLoc - minLoc + 1) + minLoc);
			int random_bhk = (int)(Math.random() * (maxBHK - minBHK + 1) + minBHK);
			int random_rent = scale * (int)(Math.random() * (maxRent - minRent + 1) + minRent);
			
			flats.add(new Flat(random_bhk, random_rent, random_city));
		}
		
		// menu to choose sorting parameter
		System.out.println("1. sort by BHK");
		System.out.println("2. sort by Rent");
		System.out.println("3. sort by Location");
		System.out.println("4. best offers");
		System.out.println("5. top picks");
		System.out.print("\nWhat do you prefer? ");
		
		switch(new Scanner(System.in).nextInt()) {
		case 1: {
			System.out.println("\nsorting by bhk:");
			Collections.sort(flats, (Flat a, Flat b) -> {
				Integer x = a.getBhk();
				Integer y = b.getBhk();
				return x.compareTo(y);
			});
			break;
		}
		case 2: {
			System.out.println("\nsorting by rent:");
			Collections.sort(flats, (Flat a, Flat b) -> {
				Integer x = a.getRent();
				Integer y = b.getRent();
				return x.compareTo(y);
			});
			break;
		}
		case 3: {
			System.out.println("\nsorting by location:");
			Collections.sort(flats, (Flat a, Flat b) -> {
				Integer x = a.getLocation();
				Integer y = b.getLocation();
				return x.compareTo(y);
			});
			break;
		}
		case 4: {
			System.out.println("\nbest offers for you:");
//			Collections.sort(flats, (Flat a, Flat b) -> {
//				Integer x = a.getBhk();
//				Integer y = b.getBhk();
//				int bhk = y.compareTo(x);
//				if (bhk == 0) {
//					Integer p = a.getRent();
//					Integer q = b.getRent();
//					int rent = p.compareTo(q);
//					if (rent == 0) {
//						Integer l = a.getLocation();
//						Integer m = b.getLocation();
//						return l.compareTo(m);
//					}
//					return rent;
//				}
//				return bhk;
//			});
			Collections.sort(flats, (Flat a, Flat b) ->{
				String rankA = ""+(maxBHK - a.getBhk()) + ""+a.getRent() + ""+a.getLocation();
				String rankB = ""+(maxBHK - b.getBhk()) + ""+b.getRent() + ""+b.getLocation();
				return rankA.compareTo(rankB);
			});
			break;
		}
		case 5: {
			System.out.println("\nTop picks for you:");
			Collections.sort(flats, (Flat a, Flat b) -> {
				Float topA = rank(a);
				Float topB = rank(b);
				return topB.compareTo(topA);
			});
			break;			
		}
		
		}
		System.out.println();
		printFlats(flats, prefer_loc);
	} // main ends here.
	
	public static float rank (Flat a) {
		/*
		 * This method calculates a rank based on all the parameters.
		 * Judgment is based on below mentioned facts:
		 *  - lower the price, higher the preference;
		 *  - lower the location rank, higher the preference;
		 *  - higher the BHK, higher the preference but in preferred location;
		 */
		return 1000*(float)a.getBhk()/(1+a.getLocation()*a.getRent()) ;
	}
	
	public static void printFlats(List<Flat> flats, String[] prefer_loc) {
		// this method prints the list.
		for (int i = 0; i < flats.size(); i++) {
			Flat f = flats.get(i);
//			System.out.println("--> "+f.getBhk()+" BHK :: Rs."+ 
//								f.getRent() + "/month :: "
//									+ prefer_loc[f.getLocation()]
//							);
			System.out.println("--> "+f.getBhk()+" Efficiency :: Rs."+ 
					f.getRent() + " :: "
						+ prefer_loc[f.getLocation()]
				);
		}
	}

}

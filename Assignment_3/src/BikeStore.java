import java.util.ArrayList;

public class BikeStore {
	public static ArrayList<Bike> allMyBikes = new ArrayList<Bike>();
	
	public static String getAllBikes() {
		String returnBikes = "";
		for (int i = 0; i < allMyBikes.size(); i++){
			returnBikes = returnBikes + "Cykel nr: " + (i + 1) + " har färgen " + allMyBikes.get(i).getColor() + ", är "
					+ allMyBikes.get(i).getSize() +" tum stor "+ "och kostar " + allMyBikes.get(i).getPrice() + " kr" + "\n";
		}
		return returnBikes;
	}
	
	public static void addBike(String color, int size, int price) {
		allMyBikes.add(new Bike(color, size, price));
	}

}

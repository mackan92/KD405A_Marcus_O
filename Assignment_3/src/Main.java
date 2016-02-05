import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Bike> allTestBikes;
	public static void main(String[] args){
		allTestBikes = new ArrayList<Bike>();
		
		allTestBikes.add(new Bike("svart",28,30000));
		allTestBikes.add(new Bike("blå",14,10000));
		allTestBikes.add(new Bike("röd",10,5000));
		allTestBikes.add(new Bike("gul",9,7000));
		
		
		for (Bike bike : allTestBikes){
			System.out.println("Cykel nr: "+ (allTestBikes.indexOf(bike)+1) + " kostar " + bike.getPrice() + "kr" + ", är " + bike.getColor() + " och är " + bike.getSize() + " tum stor.");
		}

	}


}

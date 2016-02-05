
public class Constants {
	
	/**Setting limitations*/
	
	public static final int MAX_SIZE = 28;
	public static final int MIN_SIZE = 8;
	public static final int MAX_PRICE = 30000;
	public static final int MIN_PRICE = 0;
	
	/**Setting colors that's allowed*/
	
	public static String[] bikeColors = new String[] {"svart", "blå", "röd", "gul"};
	
	public static String[] getBikeColor() {
		return bikeColors;
	}
	
	/**Setter*/
	
	public static void setBikeColors(String[] bikeColors){
		Constants.bikeColors = bikeColors;
	}
	
	/**Getters*/
	public static int getMaxSize() {
		return MAX_SIZE;
	}
	public static int getMinSize() {
		return MIN_SIZE;
	}
	public static int getMaxPrice() {
		return MAX_PRICE;
	}
	public static int getMinPrice() {
		return MIN_PRICE;
	}

}
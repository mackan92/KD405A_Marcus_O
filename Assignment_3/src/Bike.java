
public class Bike {
	private String color;
	private int price;
	private int size;
	
	/**Constructors*/
	
	public Bike (String color, int size){
		this.color = color;
		this.size = size;
	}
	
	/**Limitations. A value that are not in the right area will give a error message. */
	public Bike (String color, int size, int price){
		for(int i = 0; i < Constants.bikeColors.length; i++){
			if(0 == color.compareTo(Constants.bikeColors[i].toString())){
				this.color = color;
				break;
			} else {
				this.color = "ERROR";
			}
		}
		if(size > Constants.MIN_SIZE && size <= Constants.MAX_SIZE){
			this.size = size;
		} else{
			this.size = 404;
		}
		
		if(price > Constants.MIN_PRICE && price <= Constants.MAX_PRICE){
			this.price = price;
		} else {
			this.price = 404;
		}
		
	}
	
	/**Methods*/
	public String getColor(){
		return this.color;
	}
	public int getSize(){
		return this.size;
	}
	public int getPrice(){
		return this.price;
	}
	public void setPrice (int price){
		
	}

}

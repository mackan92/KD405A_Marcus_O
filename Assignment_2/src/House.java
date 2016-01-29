
public class House{

	private int yearBuilt;
	private int size;
	private final int minSize = 100;
	private final int maxSize = 1000;
	private final int minYear = 1800;
	private final int maxYear = 2015;
	
	
	
	public House(int yearBuilt,int size){ 
		
		
		if (yearBuilt < minYear) {
			yearBuilt = minYear;
		}
		if (yearBuilt > maxYear) {
			yearBuilt = maxYear;
		}
		if (size < minSize) {
			size = minSize;
		}
		if (size > maxSize) {
			size = maxSize;
		}
	
		this.yearBuilt = yearBuilt;
		this.size = size;
	
	}
	

	
	public int getYearBuilt(){
		return this.yearBuilt; 
	}
	
	public int getSize(){ 
		return this.size;
	} 

}

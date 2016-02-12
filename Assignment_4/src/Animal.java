
public abstract class Animal {
	private String latinName;
	private String friendlyName;
	//Constructor
	public Animal (String latinName){
		this.latinName = latinName;
	}
	//Getter
	public abstract String getInfo();
	//Setter
	public void setFriendlyName (String friendlyName){
		this.friendlyName = friendlyName;
	}
	//Getters
	public String getFriendlyName(){
		return friendlyName;
	}
	public String getLatinName(){
		return latinName;
	}
}

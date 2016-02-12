
public class Snake extends Animal{
	
	private boolean poisonous; 
	//Constructor
	public Snake (String latinName, boolean poisonous){
		super(latinName);
		this.poisonous = poisonous;
	}
	public boolean isPoisonous(){
		return this.poisonous;
	}
	//Getter. Also prints out the correct info. Also a "if-sats" that shows different results if the snake are poisonous or not.
	public String getInfo(){
		String info;
		if (isPoisonous() == false){
			info = "Denna ormen har det latinska namnet " + getLatinName() + " är inte giftig";
		} else{
			info = "Denna ormen har det latinska namnet " + getLatinName() + " är giftig!";
		}
		return info;
	}
}


public class Cat extends Mammal{
	private int numberOfLifes;
	
	public Cat (String latinName, int gestationTime, int numberOfLifes, String friendlyName){
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;
		setFriendlyName(friendlyName);
	}
	public int getNumberOfLifes(){
		return this.numberOfLifes;
	}
	public void setNumberOfLifes(int i){
		setNumberOfLifes(i);
	}
	
	public String getInfo(){
		String info;
			info = "Denna katten har det latinska namnet " + getLatinName() + " kallas för " + getFriendlyName() + " är dräktig i " + getGestationTime() + " månader och har " + getNumberOfLifes() + " liv." ;
		return info;
	}

}

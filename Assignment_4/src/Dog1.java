
public class Dog1 extends Mammal{
	
	private boolean stupid;
	
	public Dog1 (String latinName, int gestationTime, boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	public Dog1 (String latinName, int gestationTime, boolean stupid, String friendlyName ){
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}
	public boolean isStupid(){
		return this.stupid;
	}
	
	public String getInfo(){
		String info;
		if (isStupid() == false){
			info = "Denna hunden kallas för " + getFriendlyName() + ", latin: " + getLatinName() + " är dräktig i " + getGestationTime() + " månader och är inte dum";
		} else{
			info = "Denna hunden kallas för " + getFriendlyName() + ", latin: " + getLatinName() + " är dräktig i " + getGestationTime() + " månader och är dum ";
		}
		return info;
	}

}

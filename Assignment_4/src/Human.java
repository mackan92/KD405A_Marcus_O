
public class Human {
	private Dog dog;
	private String name;
	
	public Human (String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public Dog buyDog (Dog dog){
		dog = new Dog (dog.getName());
		this.dog = dog;
		return this.dog;
	
	}
	public String getInfo(){
		
		String info;
		if (dog == null){
			info = getName() + " lägg till en hund";
		}
		else{
		info = getName() + " äger en hund som heter " + dog.getName() + "\n";
		}
		return info;
	}
	
	

}

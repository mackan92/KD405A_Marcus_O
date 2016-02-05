
public class TestCat {

	public static void main(String[] args) {
		System.out.println("Detta är en test för Cat");
		System.out.println("**Start test");
		Cat c = new Cat();
		Cat a = new Cat("Browen", "Missen");
		System.out.println("One cat: " + c.getName()+ " and one: "+ a.getName());

	}

}

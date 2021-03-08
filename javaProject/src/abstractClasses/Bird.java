package abstractClasses;

public class Bird extends Animal {

	public Bird(String species) {
		super(species);
	}
	@Override
	public void sound() {
		System.out.println("짹짹");
	}

}

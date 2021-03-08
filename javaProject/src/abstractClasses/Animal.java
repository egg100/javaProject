package abstractClasses;

public abstract class Animal {
	String species;
	
	public Animal() {}; //인스턴스를 만들지 못하지만 상속받을때 필요해서 만듬
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다.");
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); // 추상메소드: 내용없이 이름만 정해둠
	//추상메소드를 정해놓으면 이 추상클래스를 상속받는 클래스는 전부 이 메소드를 정의하도록 강제할 수 있다.
}

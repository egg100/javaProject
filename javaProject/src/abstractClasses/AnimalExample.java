package abstractClasses;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new animal(); 추상클래스 인스턴스 생성 불가능
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		animal = new Cat("포유류");
		animal.breathe();
		animal.sound();
	}
}

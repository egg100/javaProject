package objects2;

public class Singleton {
	//클래스에 종속되는 하나만 만들수 있는 객체 싱글톤
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return singleton;
	}
}

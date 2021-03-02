package objects;

public class Person {
	String name;
	int age;
	double weight;
	double height;
	
	Person() {
		
	}
	
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println("먹는다.");
	}
	
	void sleep() {
		System.out.println("잔다.");
	}
	
	void walk() {
		System.out.println("걷는다.");
	}
	
	void introduce() {
		System.out.println("이름은 " + name + " 나이는 " + age + "세 입니다.");
	}
}

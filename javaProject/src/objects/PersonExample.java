package objects;

public class PersonExample {
	public static void main(String[] args) {
		// 문자열: 이름, 정수:나이 int[], String[]
		//Person[] : String, int 이렇게 클래스를 이용하면 배열에 서로다른 데이터타입을 저장할 수 있다.
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.5, 72.5);
		persons[1] = new Person("김길동", 25, 125.5, 32.5);
		persons[2] = new Person("이길동", 22, 185.5, 82.5);
		persons[3] = new Person("박길동", 19, 145.5, 42.5);
		persons[4] = new Person("최길동", 35, 185.5, 82.5);
		
		for(Person person : persons) {
			if(person.age > 20 && person.height > 180) {
				person.introduce();				
			}
		}
		
		Person person1 = new Person();
		person1.name = "홍길동";
		person1.age = 12;
		person1.introduce();
		
		
		
		Person person2 = new Person();
		person2.name = "김길동";
		person2.age = 32;
		person2.introduce();
	}
}

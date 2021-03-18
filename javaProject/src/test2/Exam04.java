package test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int eng;
	private int math;
	
	public Student(String name, int eng, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}
	
}

public class Exam04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 30, 60),
			new Student("신용권", 60, 90),
			new Student("유미선", 80, 100)
		);
		Stream<Student> stream = list.stream();
		stream
			.filter(s -> (s.getEng() + s.getMath()) < 100)
			.forEach(s -> System.out.println(s.toString()));
	}
}

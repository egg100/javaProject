package generics;

class Person {
	String name;
	Person(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
// Person 상속받는 Worker
class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}
//Person 상속받는 Student
class Student extends Person {
	Student(String name) {
		super(name);
	}
}
//Student 상속받는 HighStudent
class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}
// 수업과정
public class Course<T> {
	String courseName;
	T[] students;
	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Object[capacity];
	}
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getCourseName() {
		return this.courseName;
	}
	public T[] getStudents() {
		return this.students;
	}
}

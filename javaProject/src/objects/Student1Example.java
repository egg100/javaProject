package objects;

public class Student1Example {
	public static void main(String[] args) {

		Student1 student1 = new Student1("홍길동", 90, 85);
		Student1 student2 = new Student1("김길동", 88, 85);
		Student1 student3 = new Student1("이길동", 76, 90);
		Student1 student4 = new Student1();
//		student4.name = "최길동";
		student4.setName("최길동");
//		student4.eng = 70;
		student4.setEng(-70);
//		student4.math = 80;
		student4.setMath(80);
		System.out.println(student4.getMath() + " " + student4.getEng());
		
		Student1[] students = new Student1[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		for(Student1 student : students) {
			student.showInfo();
		}
	}
}

package test;

import java.util.Scanner;

public class StudentApp {
	
	static Student[] students = new Student[100];
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생등록 2.학생정보수정 3.학생정보삭제 4.전체리스트 9.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if(menu == 1) {//입력처리
				System.out.print("학번 입력> ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				System.out.print("나이 입력> ");
				int age = scn.nextInt();
				scn.nextLine();
				System.out.print("연락처 입력> ");
				String phone = scn.nextLine();
				System.out.print("성적 입력> ");
				int score = scn.nextInt();
				for(int i = 0; i < students.length; i++) {
					if(getStudentIndex(i) == -1) {
						students[i] = new Student(id, name, age, phone, score);	
						System.out.println("등록되었습니다.");
						break;
					}
				}
			} else if(menu == 2) { //수정처리
				System.out.print("학번 > ");
				int id = scn.nextInt();
				int index = getStudentIndex(id);
				if(index == -1) {
					System.out.println("해당하는 학생이 없습니다.");
					continue;
				}
				Student student = students[index];
				System.out.println("1.성적수정");
				System.out.println("2.연락처수정");
				System.out.println("3.이름수정");
				System.out.print("선택> ");
				menu = scn.nextInt();
				scn.nextLine();
				if(menu == 1) {
					System.out.print("성적: " + student.getScore() + " > ");
					int score = scn.nextInt();
					student.setScore(score);
					
				} else if(menu == 2) {
					System.out.print("연락처: " + student.getPhone() + " > ");
					String phone = scn.nextLine();
					student.setPhone(phone);
				} else if(menu == 3) {
					System.out.print("이름: " + student.getName() + " > ");
					String name = scn.nextLine();
					student.setName(name);
				} else {
					continue;
				}
				System.out.println("수정되었습니다.");
			} else if(menu == 3) { //삭제
				System.out.print("학번 > ");
				int id = scn.nextInt();
				scn.nextLine();
				int index = getStudentIndex(id);
				if(index == -1) {
					System.out.println("해당하는 학생이 없습니다.");
					continue;
				}
				students[index] = null;
				System.out.println("삭제되었습니다.");
			} else if(menu == 4) { //리스트
				for(Student std : students) {
					if(std != null) {				
						System.out.println(std.toString());
					}
				}
				
			} else if(menu == 9) { //종료
				break;
			} 
		} // end of while
		System.out.println("프로그램 종료.");
	} //end of main
	
	public static int getStudentIndex(int id) {
		for(int i = 0; i < students.length; i++) {					
			if(students[i] != null && students[i].getId() == id) {
				return i;
			}
		}	
		return -1;
	}
}

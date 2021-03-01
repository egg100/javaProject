package references;

import java.util.Scanner;

public class ScoreCheck {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int [][] students = null;
		int studentNum = 0;
		boolean recorded = false;
		
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상  9.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택> ");
			
			int menu = scn.nextInt();
			
			if(menu == 1) {
				if(studentNum != 0) {
					System.out.println("이미 입력했습니다.");
					continue;
				} else {
					System.out.print("학생수> ");
////				초기화
//				studentNum = 0;
//				scores = null;
					studentNum = scn.nextInt();
					students = new int[studentNum][3];
				}
			} else if(menu != 9 && studentNum == 0) {
				System.out.println("학생수를 입력하세요.");
			} else if(menu == 2) {
				if(recorded == true) {
					System.out.println("이미 입력했습니다.");
					continue;
				} else {
					for(int i =0; i < studentNum; i++) {
						System.out.print("학생번호>> ");
						students[i][0] = scn.nextInt();
						System.out.print("영어점수>> ");
						students[i][1] = scn.nextInt();
						System.out.print("수학점수>> ");
						students[i][2] = scn.nextInt();
					}	
					recorded = true;
				}
			} else if(menu != 9 && recorded == false) {
				System.out.println("학생정보가 미기입상태입니다.");
				continue;
			} else if(menu == 3) {
				for(int i =0; i < studentNum; i++) {
					studentInfoPrint(students[i]);
				}	
			} else if(menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력> ");
				int studentToFind = scn.nextInt();
				boolean found = false;
				for(int i = 0; i < studentNum; i++) {
					if(students[i][0] == studentToFind) {
						found = true;
						studentInfoPrint(students[i]);
					}
				}
				if (!found) {
					System.out.println("해당하는 학생을 찾지 못했습니다.");
				}
			} else if(menu == 5) {
				int maxEngScore = 0;
				int maxEngStudent = 0;
				for(int i = 0; i < studentNum; i++) {
					if(students[i][1] > maxEngScore) {
						maxEngStudent = students[i][0];
						maxEngScore = students[i][1];
					}
				}
				System.out.println("영어최고점: 학생번호 - " + maxEngStudent + " - 영어: " + maxEngScore);
			} else if(menu == 6) {
				int sum = 0;
				int maxSumScore = 0;
				int maxSumStudent = 0;
				for(int i = 0; i < studentNum; i++) {
					sum = students[i][1] + students[i][2];
					if(sum > maxSumScore) {
						maxSumStudent = students[i][0];
						maxSumScore = sum;
					}
				}
				double sumAvg = (maxSumScore * 10 / 2) / 10.0;
				System.out.println("학생번호: " + maxSumStudent + " 평균점수: " + sumAvg);
			} else if(menu == 7) {
				int mathSum = 0;
				for(int i = 0; i < studentNum; i++) {
					mathSum += students[i][2];
				}
				double mathSumAvg = (mathSum * 10 / studentNum) / 10.0;
				System.out.println("평균점수: " + mathSumAvg);
				for(int i = 0; i < studentNum; i++) {
					if(mathSumAvg < students[i][2]) {	
						System.out.println("학생번호: " + students[i][0] + " 수학점수: " + students[i][2]);
					}
				}
			} else if(menu == 9) {
				break;
			}
		} // end of while
		scn.close();
		System.out.println("프로그램 종료");
	}// end of main
	
	public static void studentInfoPrint (int[] student) {
		System.out.println("학생정보 - 번호:" + student[0] + ", 영어:" + student[1] + ", 수학:" + student[2]);
	}
}

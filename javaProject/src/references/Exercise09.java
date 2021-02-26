package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				System.out.print("학생수> ");
//				초기화
				studentNum = 0;
				scores = null;
				studentNum = scn.nextInt();
				scores = new int[studentNum];
			} else if(selectNo != 5 && scores == null) {
				System.out.println("학생수를 입력하세요...");
			} else if(selectNo == 2) {
				for(int i =0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = scn.nextInt();
				}	
			} else if(selectNo == 3) {
				for(int i =0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}	
			} else if(selectNo == 4) {
				int sum = 0;
				int maxNum = 0;
				for(int i =0; i < studentNum; i++) {
					sum += scores[i];
					if(maxNum < scores[i]) {
						maxNum = scores[i];
					}
				}
				double avg = (double)sum / studentNum;
				System.out.println("최고 점수: " + maxNum);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		} // end of while
		scn.close();
		System.out.println("프로그램 종료");
	}
}

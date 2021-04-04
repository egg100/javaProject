package exercise;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		
		while(true) {
			int choice = 0;
			int random = (int) Math.random()*3+1;
			System.out.println("");
			System.out.println("----------가위바위보 시작!----------");
			System.out.println("1. 가위 | 2. 바위 | 3. 보");
			System.out.print("선택하세요: ");
			choice = scn.nextInt();
			
			if(choice < 1 || choice > 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.println("Com:" + changeRPS(random)
					+ " You:" + changeRPS(choice));
			
			if(choice == random) {
				System.out.println("비겼습니다.");
			} else if(
						choice == 1 && random == 3
						|| choice == 2 && random == 1
						|| choice == 3 && random == 2
					) {
				System.out.println("이겼습니다.");
				win++;
			} else {
				System.out.println("졌습니다.");
				lose++;
			}
			System.out.println("win: " + win + " lose: " + lose);
			if(win > 2) {
				System.out.println("3판 승리!!");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
	
	static String changeRPS(int num) {
		switch(num) {
			case 1: return "가위";
			case 2: return "바위";
			case 3: return "보";
		}
		return null;
	}
}

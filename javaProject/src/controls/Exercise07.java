package controls;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scn = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료 ");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금액>");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.println("출금액>");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고>" + balance);
			} else if (menu ==4) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}

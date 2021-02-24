package controls;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		// System.in.read(); 키보드 입력 값을 받음
		// Scanner.readLine(); 문자로 받아올때
		// Scanner.readInt(); 숫자값을 받아올때
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String str = scn.nextLine();
		System.out.println("입력한 값은: " + str);

		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
		} while (!str.equals("q"));

		System.out.println("프로그램 종료.");
		scn.close();
	}
}

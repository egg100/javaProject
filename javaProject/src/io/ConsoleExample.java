package io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		//이 예제는 이클립스에서 널포인트 에러가 발생.
		//System.console() 메소드가 null을 리턴하기 때문
		//cmd에서 실행해야 함
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("----------------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}

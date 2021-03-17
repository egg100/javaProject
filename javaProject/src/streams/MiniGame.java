package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiniGame {
	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		
		int[] random = new int[3];
		boolean r = true;
		while(true) {
			if(r) {
				System.out.println("새 게임");
				System.out.print("랜덤: ");
				for(int i =0; i <3 ; i++) {
					random[i] = (int)(Math.random() * 9) + 1;
					System.out.print(random[i]);
				}
				r = false;
			}
			int ball = 0;
			int strike = 0;
			
			System.out.println();
			System.out.print("3자리 숫자 입력 >");
			String answer = scn.nextLine();
			String[] strArr = answer.split("");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i <intArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			
			if(intArr.length != 3) {
				System.out.println("세자리의 숫자로 입력해 주세요.");
				continue;
			}
		
			for(int i =0; i < 3; i++) {
				if(random[i] == intArr[i]) {
					strike++;
					continue;
				}
				for(int j =0; j < 3; j++) {
					if(random[i] == intArr[j]) {
						ball++;
					}
				}
			} //end of for
			System.out.println(strike + "스트라이크/ " + ball + "볼");
			if(strike == 3) {
				System.out.println("승리했습니다");
				r = true;
				continue;
			}
			
		}// end of while
//		System.out.println("프로그램이 종료되었습니다.");
	}
}

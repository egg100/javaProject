package exercise;

import java.util.Scanner;

public class WordChainGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String standard = "오리";
		String[] stored = new String[100];
		boolean sameWord = false;
		int count = 0;
		
		while(true) {
			System.out.println("이전단어: " + standard);
			System.out.print("입력: ");
			String word = scn.nextLine();
			stored[count] = word;
			
			char last = standard.charAt(standard.length()-1);
			char first = word.charAt(0);
			if(last != first) {
				System.out.println("규칙을 지켜주세요!");
				continue;
			}
			for(int i = 0; i < count; i++) {
				if(stored[i].equals(word)) {
					sameWord = true;
					break;
				}
			}
			if(sameWord) {
				System.out.println("이미 사용한 단어입니다! 다시!");
				sameWord = false;
				continue;
			}
			
			standard = word;
			count++;
			System.out.println(count + "회째");
		}
		
	}
}

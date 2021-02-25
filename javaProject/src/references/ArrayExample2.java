package references;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intArys = new int[10];
		int sum =0;
		int cnt = 0;
		int evenSum = 0;
		for(int i = 0; i < intArys.length; i++) {
			intArys[i] = (int)(Math.random() * 100) + 1;
			sum += intArys[i];
			System.out.println(intArys[i]);
			if(intArys[i] % 2 == 0) {
				cnt++;
				evenSum += intArys[i];
			}
		}
		double avg = (double)sum / intArys.length;
		double evenAvg = (double)evenSum / cnt;
		
		System.out.println("합: " + sum);
		System.out.println("짝수합: " + evenSum);
		System.out.println("평균: " + avg);
		System.out.println("짝수평균: " + evenAvg);
		int n;
		for(int j = 1; j < intArys.length; j++) {
			for(int i = 0; i < intArys.length - j; i++) {
				if(intArys[i] > intArys[i+1]) {
					n = intArys[i];
					intArys[i] = intArys[i+1];
					intArys[i+1] = n;
				}
			}
		}
		System.out.println("정렬");
		for(int i = 0; i < intArys.length; i++) {
			System.out.println(intArys[i]);
		}
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("배열의 위치 입력: ");
			int loc = scn.nextInt();
			if(loc < 0) {
				break;
			}
			System.out.println(loc + "위치의 배열값은: " + intArys[loc]);
		}
		scn.close();
		System.out.println("end of prog");
	}
}

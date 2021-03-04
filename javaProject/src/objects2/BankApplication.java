package objects2;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposite();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		} // while 루프 끝
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		scn.nextLine();
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				System.out.print("계좌번호: ");
				String ano = scn.nextLine();
				System.out.print("계좌주: ");
				String owner = scn.nextLine();
				System.out.print("초기입금액: ");
				int balance = scn.nextInt();
				accountArray[i] = new Account2(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		scn.nextLine();
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "	" + accountArray[i].getOwner() + "	" + accountArray[i].getBalance());
			}
		}
	}
	
	private static void deposite() {
		scn.nextLine();
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		Account2 account = findAccount(scn.nextLine());
		if(account == null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
		} else {			
			System.out.print("예금액: ");
			account.setBalance(account.getBalance() + scn.nextInt());
			System.out.println("결과: 예금이 성공되었습니다.");		
		}
	}
	
	private static void withdraw() {
		scn.nextLine();
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		Account2 account = findAccount(scn.nextLine());
		if(account == null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
		} else {			
			System.out.print("출금액: ");
			account.setBalance(account.getBalance() - scn.nextInt());
			System.out.println("결과: 출금이 성공되었습니다.");		
		}
	}
	
	private static Account2 findAccount(String ano) {
		Account2 result = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {				
				if(ano.equals(accountArray[i].getAno())) {
					result =  accountArray[i];
				}
			}
		}
		return result;
	}
}


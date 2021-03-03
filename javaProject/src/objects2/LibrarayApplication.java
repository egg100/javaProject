package objects2;

import java.util.Scanner;

public class LibrarayApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1)도서정보등록 2)회원정보등록 3)도서대여 4)도서반납 5)도서목록 9)종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				scn.nextLine();
				System.out.print("도서명> ");
				String title = scn.nextLine();
				System.out.print("저자명> ");
				String author = scn.nextLine();
				System.out.print("출판사> ");
				String publisher = scn.nextLine();
				System.out.print("가격> ");
				int price = scn.nextInt();
				
				for(int i = 0; i < bookList.length; i++) {
					if(bookList[i] == null) {
						bookList[i] = new Book(title, author, publisher, price);
						break;
					}
				}
				
			} else if(menu == 2) {
				scn.nextLine();
				System.out.print("ID 입력> ");
				String id = scn.nextLine();
				user.setId(id);
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				user.setName(name);
					
			} else if(menu == 3) {
				scn.nextLine();
				boolean finded = false;
				System.out.print("책제목 입력> ");
				String bookToRent = scn.nextLine();
				for(int i = 0; i < bookList.length; i++) {
					if(bookList[i] != null) {
						if(bookList[i].getTitle().equals(bookToRent)) {
							user.rent(bookList[i]);
							System.out.println(bookList[i].getTitle() + "가 대출되었습니다.");
							finded = true;
							break;
						}
					}
				}
				if(!finded) {
					System.out.println("해당하는 도서가 존재하지 않습니다.");
				}
				
			} else if(menu == 4) {
				scn.nextLine();
				System.out.print("책제목 입력> ");
				boolean finded = false;
				String bookToFind = scn.nextLine();
				for(int i = 0; i < bookList.length; i++) {
					if(bookList[i] != null) {
						if(bookList[i].getTitle().equals(bookToFind)) {
							user.overdue(bookList[i]);
							System.out.println(bookList[i].getTitle() + "가 반납되었습니다.");
							finded = true;
							break;
						}
					}
				}
				if(!finded) {
					System.out.println("해당하는 도서가 존재하지 않습니다.");
				}
				
			} else if(menu == 5) {
				user.getBookInfo();
			} else if(menu == 9) {
				break;
			}
		}
	}
}

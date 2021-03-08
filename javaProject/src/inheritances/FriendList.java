package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10];
	
	public static void main(String[] args) {
		
		friends[0] = new Friend("임성원", "01012345678");
		friends[1] = new ComFriend("정준영", "01012123434", "총무부서");
		friends[2] = new UnivFriend("도왕락", "01045456767", "역사학과");
		
//		for(Friend friend : friends) {
//			if(friend != null) {
//				System.out.println(friend.toString());
//			}
//		}
		
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println("=================================================");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if(menu == 1) {
				scn.nextLine();
				System.out.println("친구추가");
				System.out.print("이름> ");
				String name = scn.nextLine();
				System.out.print("번호> ");
				String phone = scn.nextLine();
				saveFriend(new Friend(name, phone));
			} else if(menu == 2){
				scn.nextLine();
				System.out.println("학교친구추가");
				System.out.print("이름> ");
				String name = scn.nextLine();
				System.out.print("번호> ");
				String phone = scn.nextLine();
				System.out.print("학과> ");
				String major = scn.nextLine();
				saveFriend(new UnivFriend(name, phone, major));
			} else if(menu == 3){
				scn.nextLine();
				System.out.println("회사친구추가");
				System.out.print("이름> ");
				String name = scn.nextLine();
				System.out.print("번호> ");
				String phone = scn.nextLine();
				System.out.print("부서> ");
				String department = scn.nextLine();
				saveFriend(new ComFriend(name, phone, department));
			} else if(menu == 4){
				System.out.println("전체목록");
				for(Friend friend : friends) {
					if(friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if(menu == 5){
				scn.nextLine();
				System.out.print("친구이름> ");
				String findName = scn.nextLine();
				boolean finded = false;
				for(Friend friend : friends) {
					if(friend != null && findName.equals(friend.getName())) {
						System.out.println("친구정보: " + friend.toString());
						finded = true;
					}
				}
				if(!finded) {
					System.out.println("일치하는 친구가 없습니다.");
				}
			} else if(menu == 6){
				break;
			}
		} // end of while
		scn.close();
		System.out.println("프로그램 종료");
		
	}// end of main
	
	public static void saveFriend(Friend friend) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				System.out.println("추가되었습니다.");
				break;
			}
		}
	}
}

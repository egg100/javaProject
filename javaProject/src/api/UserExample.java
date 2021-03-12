package api;

import java.util.HashMap;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello23".hashCode());
		
		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		User user2 = new User();
		user2.userId = "user1";
		user2.score = 80;
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		System.out.println(user1 == user2);
		
		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user2, "박길동");
		
		String r1 = hashMap.get(user1);
		String r2 = hashMap.get(user2);
		System.out.println(r1 + ", " + r2);
	}
}

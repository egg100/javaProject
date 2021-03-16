package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct()
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		names.stream()
			.filter(t -> t.startsWith("신"))
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(t -> t.startsWith("신"))
			.forEach(t -> System.out.println(t));
		
		List<Member> member = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("홍길동", Member.MALE, 30),
			new Member("박수미", Member.FEMALE, 27)
		);
		
		member.stream().distinct().forEach(System.out::println);
	}
}

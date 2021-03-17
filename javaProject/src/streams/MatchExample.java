package streams;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		
		boolean result = Arrays.stream(intArr)
			.allMatch(new IntPredicate() {
				@Override
				public boolean test(int value) {
					return value%2 == 0;
				}
			});
		System.out.println("모두 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr)
			.anyMatch(a -> a%3==0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
			.noneMatch(a -> a%3==0);
		System.out.println("3의 배수가 없는가? " + result);
	}
}

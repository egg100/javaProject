package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray); //Stream<T>
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = { 3, 8, 9, 5, 4 };
//	 	IntStream intStream = Arrays.stream(intArray);
	 	IntStream intStream = IntStream.of(intArray); // Stream<Integer> vs IntStream
	 	
	 	int sum = intStream.filter(t -> t%2 == 0).sum();
	 	System.out.println("합계는: " + sum);
	 	
	 	intStream = Arrays.stream(intArray);
	 	OptionalDouble od = intStream.filter(t -> t%2 == 0).average();
	 	System.out.println("평균: " + od.getAsDouble());
	 	
	 	sum = 0;
	 	for(int a : intArray) {
	 		if(a % 2 == 0) {
	 			sum += a;
	 		}
	 	}
	 	System.out.println("합계는: " + sum);
	}
}

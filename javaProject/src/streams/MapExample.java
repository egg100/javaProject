package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		studentList.stream()
			.mapToInt(t -> t.getScore()) // IntStream != Stream<Integer>
			.forEach(v -> System.out.println(v));
		
		int[] intAry = {};
		Integer[] integerAry = {};
		
		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);
	}
}

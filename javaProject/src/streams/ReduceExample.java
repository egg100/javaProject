package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class ReduceExample {
	public static void main(String[] args) {
		Student[] students = {
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		};
		int sum = Arrays.stream(students)
			.mapToInt(s -> s.getScore())
			.reduce(0, new IntBinaryOperator() {
				int sum = 0;
				int cnt = 0;
				@Override
				public int applyAsInt(int left, int right) {
					sum += right;
					cnt++;
					System.out.println("l: " + left + ", r: " + right);
//					return left > right ? left: right;
//					int a = students.length;
//					int b = students[a-1].getScore();
//					if(b == right) {
//						return (left+right)/a;
//					}
					return sum/cnt;
//					return left + right;
				}
			});
		System.out.println("sum: " + sum);
	}
}

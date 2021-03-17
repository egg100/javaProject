package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(new DoubleConsumer() {
				@Override
				public void accept(double d) {
					System.out.println(d);
				}
			})
		;
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(new Consumer<Integer>() {
				@Override
				public void accept(Integer t) {
					System.out.println(t.intValue());
				}
			})
		;
	}
}

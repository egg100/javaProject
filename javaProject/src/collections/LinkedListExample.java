package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간:" + (endTime - startTime));
		
		list = new LinkedList<>();
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간:" + (endTime - startTime));
	}
}

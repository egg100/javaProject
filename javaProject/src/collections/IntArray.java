package collections;

import java.util.ArrayList;
import java.util.List;

public class IntArray {
	public static void main(String[] args) {		
		int[] intAry = {4, 8, 3};
		
		for(int j = 0; j < intAry.length-1; j++) {
			for(int i = 1; i < intAry.length-j; i++) {
				if(intAry[i-1] < intAry[i]) {
					int keep = intAry[i-1];
					intAry[i-1] = intAry[i];
					intAry[i] = keep;
				}
			}
		}
		
		for(int i : intAry) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		List<Integer> aList = new ArrayList<>();
		aList.add(3);
		aList.add(8);
		aList.add(4);
		aList.add(2);
		aList.add(1);
		aList.add(0);
		for(int j = 0; j < aList.size()-1; j++) {
			for(int i = 1; i < aList.size()-j; i++) {
				if(aList.get(i-1) < aList.get(i)) {
					int keep = aList.get(i-1);
					aList.set(i-1,aList.get(i));
					aList.set(i, keep);
				}
			}
		}
		
		for(int i : aList) {
			System.out.println(i);
		}
	}
}

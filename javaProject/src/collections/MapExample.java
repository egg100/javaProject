package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20);
		map.put("박소연", 23);
		map.put("홍길동", 25);
		
		Integer result = map.get("홍길동");
		Set<String> set = map.keySet();
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Integer val = map.get(key);
//			System.out.println("key: " + key + ", val: " + val);
//		}
		
		System.out.println(result);
		
		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10);
	}
}
